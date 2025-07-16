package com.library.moviecatalog.service.impl;

import com.library.moviecatalog.domain.Movie;
import com.library.moviecatalog.service.IMoviesService;
import java.util.ArrayList;
import java.util.List;

public class MoviesService implements IMoviesService {
  private final List<Movie> movies;

  public MoviesService() {
    this.movies = new ArrayList<>();
  }

  @Override
  public void showMovies() {
    System.out.println("Available Movies:");
    if (movies.isEmpty()) {
      System.out.println("No movies available.");
    } else {
      for (Movie movie : movies) {
        System.out.println(movie);
      }
    }
  }

  @Override
  public void addMovie(Movie movie) {
    if (movie == null) {
      System.out.println("Cannot add a null movie.");
      return;
    }
    if (movies.contains(movie)) {
      System.out.println("Movie already exists: " + movie.getName());
    } else {
      movies.add(movie);
      System.out.println("Movie added: " + movie.getName());
    }
  }

  @Override
  public void findMovie(Movie movie) {
    //return index of the movie if found, otherwise return -1
    var index = movies.indexOf(movie);
    if (index != -1) {
      System.out.println("Movie found: " + movies.get(index).getName());
    } else {
      System.out.println("Movie not found: " + movie.getName());
    }
  }
}
