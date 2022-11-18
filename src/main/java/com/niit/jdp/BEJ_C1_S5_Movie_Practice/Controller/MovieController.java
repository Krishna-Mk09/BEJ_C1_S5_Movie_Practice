/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Movie_Practice.Controller;

import com.niit.jdp.BEJ_C1_S5_Movie_Practice.Domain.Movie;
import com.niit.jdp.BEJ_C1_S5_Movie_Practice.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    // A constructor injection.
    private final MovieService movieService;

    // This is a constructor injection.
    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    /**
     * The function takes in a movie object, and returns a response entity with the movie object that was saved
     *
     * @param movie The movie object that is to be saved.
     * @return A response entity with the movie object and a status of created.
     */
    @PostMapping("/insertMovie")
    public ResponseEntity<?> saveFunction(@RequestBody Movie movie) {
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    /**
     * It returns a list of all movies in the database
     *
     * @return A list of movies
     */
    @GetMapping("/fetchAllMovies")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(movieService.fetchAllMovies(), HttpStatus.OK);
    }

    /**
     * This function deletes a movie from the database by its id
     *
     * @param movieId The id of the movie to be deleted.
     * @return A response entity with a message and a status code.
     */
    @DeleteMapping("/deleteById/{movieId}")
    public ResponseEntity<?> deleteFunction(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
        return new ResponseEntity<>("deleted", HttpStatus.CREATED);
    }

    /**
     * This function is a GET request that takes in a movieId as a path variable and returns a ResponseEntity with the
     * movie object that matches the movieId
     *
     * @param movieId The id of the movie you want to fetch.
     * @return A ResponseEntity object is being returned.
     */
    @GetMapping("/getById/{movieId}")
    public ResponseEntity<?> getByIdFunction(@PathVariable int movieId) {
        movieService.fetchMovieById(movieId);
        return new ResponseEntity<>(movieService.fetchMovieById(movieId), HttpStatus.OK);
    }

    /**
     * This function updates a movie record in the database by taking in a movieId and a movie object
     *
     * @param movieId The id of the movie to be updated.
     * @param movie   This is the object that we are passing in the request body.
     * @return A ResponseEntity object is being returned.
     */
    @PutMapping("/updateById/{movieId}")
    public ResponseEntity<?> updateByIdFunction(@PathVariable int movieId, @RequestBody Movie movie) {
        movieService.updateMovie(movieId, movie);
        return new ResponseEntity<>("Movie Record Updated", HttpStatus.OK);
    }

}
