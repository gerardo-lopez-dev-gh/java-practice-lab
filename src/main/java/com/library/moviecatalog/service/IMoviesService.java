package com.library.moviecatalog.service;

import com.library.moviecatalog.domain.Movie;

public interface IMoviesService {
    public void showMovies();
    public void addMovie(Movie movie);
    public void findMovie(Movie movie);


}
