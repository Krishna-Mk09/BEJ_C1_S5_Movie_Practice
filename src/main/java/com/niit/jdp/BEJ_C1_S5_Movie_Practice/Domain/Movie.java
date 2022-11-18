/*
 * Author Name : M.Krishna.
 * Date: 18-11-2022
 * Created With: IntelliJ IDEA Community Edition
 *
 */


package com.niit.jdp.BEJ_C1_S5_Movie_Practice.Domain;

public class Movie {
    private String movieId;
    private String movieName;
    private String directorName;
    private String actorName;

    public Movie() {
    }

    public Movie(String movieId, String movieName, String directorName, String actorName) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.directorName = directorName;
        this.actorName = actorName;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId='" + movieId + '\'' +
                ", movieName='" + movieName + '\'' +
                ", directorName='" + directorName + '\'' +
                ", actorName='" + actorName + '\'' +
                '}';
    }
}
