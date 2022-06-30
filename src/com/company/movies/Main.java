package com.company.movies;

import java.util.*;

public class Main {

    public static void main(String[] args){
        runYear();
        runReverse();
        runName();
        runReversedName();
    }
    public static void runYear(){

        System.out.println("----------------------------------------YearOfProduction------------------------");
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------YearReversed------------------------");
    }

    public static void runReverse(){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Name Of Movie------------------------");
    }

    public static void runName(){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------NameReversed------------------------");
    }

    public static void runReversedName(){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Director Name------------------------");
    }

    public static void runDirectorName(){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
//        Comparator<Movie> cmp = Comparator.comparing(Movie::getDirector);
//        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------NameReversed------------------------");
    }

}
