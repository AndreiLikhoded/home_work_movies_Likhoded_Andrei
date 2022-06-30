package com.company.movies;

import java.util.Arrays;

public class Movies {
    Movie[] movies;

    public Movie[] getMovies() {
        return movies;
    }

    public void setMovies(Movie[] movies) {
        this.movies = movies;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "movies=" + Arrays.toString(movies) +
                '}';
    }
}
