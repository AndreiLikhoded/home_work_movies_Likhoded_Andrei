package com.company.movies;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MovieService {

    public static Map<String, List<Movie>> readFile(){
        Gson gson = new Gson();
        Path path = Paths.get("./movies.json");

        String json;
        try {
            json = Files.readString(path);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        return gson.fromJson(json, new TypeToken<Map<String, List<Movie>>>() {}.getType());
    }
}
