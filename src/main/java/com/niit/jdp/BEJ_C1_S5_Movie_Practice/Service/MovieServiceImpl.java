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

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public boolean deleteMovie(int movieId) {
        movieRepository.deleteById(movieId);
        return true;
    }

    @Override
    public List<Movie> fetchAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Optional<Movie> fetchMovieById(int movieId) {
        return movieRepository.findById(movieId);
    }

    @Override
    public void updateMovie(int movieId, Movie movie) {
        movieRepository.save(movie);
    }
}
