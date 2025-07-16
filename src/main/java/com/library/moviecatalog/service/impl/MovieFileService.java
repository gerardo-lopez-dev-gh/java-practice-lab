package com.library.moviecatalog.service.impl;

import com.library.moviecatalog.domain.Movie;
import com.library.moviecatalog.service.IMoviesService;
import java.io.File;

public class MovieFileService implements IMoviesService {
  private final String fileName = "movies.txt";

  public MovieFileService() {
    var file = new File(fileName);
    try {
      if (file.exists()) {
        System.out.println("The movie file exists.");
      }
    } catch (Exception e) {
      System.out.println(
          "An error occurred while initializing the movie file service: " + e.getMessage());
    }
  }

  @Override
  public void showMovies() {}

  @Override
  public void addMovie(Movie movie) {}

  @Override
  public void findMovie(Movie movie) {}
}
