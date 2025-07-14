package com.library.peoplelistapp;

import com.library.peoplelistapp.model.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PeopleListApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Create a list to hold Person objects
    List<Person> peopleList = new ArrayList<>();
    // start menu
    boolean exit = false;
    while (!exit) {
      showMenu();
      try {
        exit = excuteOperation(scanner, peopleList);
      } catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
      }
    }
  }

  private static void showMenu() {
    System.out.print(
"""
*** People List App Menu ***
1. Add Person
2. View People List
3. Exit
""");
    System.out.print("Please select an option (1-3): ");
  }

  private static boolean excuteOperation(Scanner scanner, List<Person> peopleList) {
    var option = scanner.nextInt();
    boolean exit = false;

    switch (option) {
      case 1 -> {
        // Add Person
        addPeople(scanner, peopleList);
      } // end case 1
      case 2 -> {
        showPeopleList(peopleList);
      } // end case 2
      case 3 -> {
        System.out.println("Exiting the application. Goodbye!");
        exit = true;
      } // end case 3
      default -> {
        System.out.println("Invalid option. Please select a valid option (1-3).");
      } // end defaultk
    } // end switch
    return exit;
  }

  private static void showPeopleList(List<Person> peopleList) {
    System.out.println("*** People List ***");
    if (peopleList.isEmpty()) {
      System.out.println("No people in the list.");
    } else {
      //peopleList.forEach((person -> System.out.println(person)));
      peopleList.forEach(System.out::println);
    }
  }

  private static void addPeople(Scanner scanner, List<Person> peopleList) {
    // Add Person
    scanner.nextLine(); // Consume the newline character
    System.out.print("Enter name: ");
    String name = scanner.nextLine();
    System.out.print("Enter phone number: ");
    String phoneNumber = scanner.nextLine();
    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    Person person = new Person(name, phoneNumber, email);
    peopleList.add(person);
    System.out.println("Person added successfully!");
    System.out.println("count: " + peopleList.size());
  }
}
