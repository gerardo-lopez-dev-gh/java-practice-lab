package com.library.moviecatalog.presentation;

import com.library.moviecatalog.service.IMoviesService;
import com.library.moviecatalog.service.impl.MoviesService;
import com.library.moviecatalog.domain.Movie;
import java.util.Scanner;

public class MovieCatalog {
  public static void main(String[] args) {
    boolean exit = false;
    Scanner scanner = new Scanner(System.in);
    // add implementation of IMoviesService
    IMoviesService moviesService = new MoviesService();
    // start menu
    while (!exit) {
      System.out.println("---------------------------------");
      showMenu();
      try {
        exit = executeOperation(scanner, moviesService);
      } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
      }
      System.out.println("---------------------------------");
    }
  }

  private static void showMenu() {
    System.out.print(
"""
*** Movie Catalog App Menu ***
1. Show Movies
2. Add Movie
3. Find Movie
4. Exit
""");
    System.out.print("Please select an option (1-4): ");
  }

  private static boolean executeOperation(Scanner scanner, IMoviesService moviesService) {
    var option = scanner.nextInt();
    boolean exit = false;
    switch (option) {
      case 1 -> {
        // Show Movies
        moviesService.showMovies();
      }
      case 2 -> {
        // Add Movie
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter movie name to add:");
        String movieName = scanner.nextLine();
        moviesService.addMovie(new Movie(movieName));
      }
      case 3 -> {
        // Find Movie
        scanner.nextLine(); // Consume the newline character
        System.out.println("Enter movie name to find:");
        String movieName = scanner.nextLine();
        moviesService.findMovie(new Movie(movieName));
      }
      case 4 -> {
        System.out.println("Exiting the application. Goodbye!");
        exit = true;
      }
      default -> {
        System.out.println("Invalid option. Please select a valid option (1-4).");
      }
    }
    return exit;
  }
}
