/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Movie_Practice.Service;

import com.niit.jdp.BEJ_C1_S5_Movie_Practice.Domain.Movie;
import com.niit.jdp.BEJ_C1_S5_Movie_Practice.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    // A field injection.
    private final MovieRepository movieRepository;

    // A constructor injection.
    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    /**
     * It saves the movie to the database.
     *
     * @param movie The movie object that we want to save.
     * @return The movie object is being returned.
     */
    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    /**
     * It deletes a movie from the database.
     *
     * @param movieId The id of the movie to be deleted.
     * @return A boolean value.
     */
    @Override
    public boolean deleteMovie(int movieId) {
        movieRepository.deleteById(movieId);
        return true;
    }

    /**
     * > The function fetches all the movies from the database and returns them as a list
     *
     * @return A list of all movies in the database.
     */
    @Override
    public List<Movie> fetchAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    /**
     * > It returns an Optional of Movie, which is fetched by the movieId
     *
     * @param movieId The id of the movie to be fetched.
     * @return Optional<Movie>
     */
    @Override
    public Optional<Movie> fetchMovieById(int movieId) {
        return movieRepository.findById(movieId);
    }

    // Updating the movie.
    @Override
    public void updateMovie(int movieId, Movie movie) {
        movieRepository.save(movie);
    }
}
