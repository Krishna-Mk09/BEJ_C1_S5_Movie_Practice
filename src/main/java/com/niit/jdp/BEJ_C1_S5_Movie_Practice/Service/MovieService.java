package com.niit.jdp.BEJ_C1_S5_Movie_Practice.Service;

import com.niit.jdp.BEJ_C1_S5_Movie_Practice.Domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieService {
    Movie saveMovie(Movie movie);

    boolean deleteMovie(int movieId);

    List<Movie> fetchAllMovies();

    Optional<Movie> fetchMovieById(int movieId);

    void updateMovie(int mid, Movie movie);
}
