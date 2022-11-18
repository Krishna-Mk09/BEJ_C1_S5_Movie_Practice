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
    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/insertMovie")
    public ResponseEntity<?> saveFunction(@RequestBody Movie movie) {
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("/fetchAllMovies")
    public ResponseEntity<?> fetchFunction() {
        return new ResponseEntity<>(movieService.fetchAllMovies(), HttpStatus.OK);
    }

    @DeleteMapping("/deleteById/{movieId}")
    public ResponseEntity<?> deleteFunction(@PathVariable int movieId) {
        movieService.deleteMovie(movieId);
        return new ResponseEntity<>("deleted", HttpStatus.CREATED);
    }

    @GetMapping("/getById/{movieId}")
    public ResponseEntity<?> getByIdFunction(@PathVariable int movieId) {
        movieService.fetchMovieById(movieId);
        return new ResponseEntity<>(movieService.fetchMovieById(movieId), HttpStatus.OK);
    }

    @PutMapping("/updateById/{movieId}")
    public ResponseEntity<?> updateByIdFunction(@PathVariable int movieId, @RequestBody Movie movie) {
        movieService.updateMovie(movieId, movie);
        return new ResponseEntity<>("Movie Record Updated", HttpStatus.OK);
    }

}
