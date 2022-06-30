package com.company.movies;

import java.util.*;

public class Main {

    public static void main(String[] args){
        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        ArrayList<Movie> movie1 = new ArrayList<>(movie);
        runYear(movie1);
        runReverse(movie1);
        runName(movie1);
        runReversedName(movie1);
        runDirectorName(movie1);
        runDirectorReversedName(movie1);
    }
    public static void runYear(List<Movie> movie){

        System.out.println("----------------------------------------YearOfProduction------------------------");

        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------YearReversed------------------------");
    }

    public static void runReverse(List<Movie> movie){
        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Name Of Movie------------------------");
    }

    public static void runName(List<Movie> movie){
        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------NameReversed------------------------");
    }

    public static void runReversedName(List<Movie> movie){
        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Director Name------------------------");
    }

    public static void runDirectorName(List<Movie> movie){
        Comparator<Movie> cmp = Comparator.comparing(Movie::getDirectorName);
//        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------DirectorNameReversed------------------------");
    }

    public static void runDirectorReversedName(List<Movie> movie){
        Comparator<Movie> cmp = Comparator.comparing(Movie::getDirectorName);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------DirectorNameReversed------------------------");
    }

}
