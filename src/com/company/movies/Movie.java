package com.company.movies;

import java.util.Arrays;

public class Movie implements Comparable<Movie>{
    private String name;
    private int year;
    private String description;
    Director director;

    Cast[] cast;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }
    public String getDirectorName() {
        return director.getFullName();
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @Override
    public int compareTo(Movie nameDirector) {
        return this.getDirector().getFullName().compareTo(nameDirector.getDirector().getFullName());
    }

    @Override
    public String toString() {
        String str = String.format("|%-42s|%5s |%-10s|%-17s| \n %s \n", name,year,description,director, Arrays.toString(cast) +" ");
        return str;
    }
}
