package com.company.movies;

import java.util.*;

public class Main {

    public static void main(String[] args){
        run();
    }
    public static void run(){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
//        Comparator<Movie> cmp1 = Comparator.comparing(Movie::getName);
        movie.sort(cmp);
//        movie.sort(cmp1);
        for (Movie m : movie) {
            System.out.println(m);
        }
        movieList.containsKey("Sherlock");
    }
    public static void runReverse(){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
    }
}
