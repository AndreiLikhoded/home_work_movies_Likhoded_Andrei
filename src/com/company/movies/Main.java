package com.company.movies;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Map<String, List<Movie>> movieList = MovieService.readFile();
        List<Movie> movie = movieList.get("movies");
        ArrayList<Movie> movie1 = new ArrayList<>(movie);
        runYear(movie1);
        runReverse(movie1);
        runName(movie1);
        runReversedName(movie1);
        runDirectorName(movie1);
        runDirectorReversedName(movie1);
        findMovieName(movie);
    }

    public static void runYear(List<Movie> movie) {

        System.out.println("----------------------------------------YearOfProduction------------------------");

        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------YearReversed------------------------");
    }

    public static void runReverse(List<Movie> movie) {
        Comparator<Movie> cmp = Comparator.comparingInt(Movie::getYear);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Name Of Movie------------------------");
    }

    public static void runName(List<Movie> movie) {
        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        movie.sort(cmp);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------NameReversed------------------------");
    }

    public static void runReversedName(List<Movie> movie) {
        Comparator<Movie> cmp = Comparator.comparing(Movie::getName);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Director Name------------------------");
    }

    public static void runDirectorName(List<Movie> movie) {
        movie.sort(Movie::compareTo);
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------DirectorNameReversed------------------------");
    }

    public static void runDirectorReversedName(List<Movie> movie) {
        Comparator<Movie> cmp = Comparator.comparing(Movie::getDirectorName);
        movie.sort(cmp.reversed());
        for (Movie m : movie) {
            System.out.println(m);
        }
        System.out.println("-------------------------------------------Find Name Of Movie------------------------");
    }

    public static String findMovieName(List<Movie> movie) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert the name of movie: ");
        String movieName = scanner.nextLine();
        Pattern pattern = Pattern.compile("\\d");
        for (Movie mov : movie) {
            Matcher matcher = pattern.matcher(mov.getName().toUpperCase());
            if(matcher.find()){
                System.out.println(mov.getName());
            }
        }
        return movieName;
    }
}
