package com.library.computersalesapp;

import com.library.computersalesapp.model.Computer;
import com.library.computersalesapp.model.Keyboard;
import com.library.computersalesapp.model.Monitor;
import com.library.computersalesapp.model.Mouse;

public class ComputerSalesApp {
  public static void main(String[] args) {
    Mouse mouseLenovo = new Mouse("Wireless", "Lenovo");
    System.out.println("Mouse Details: " + mouseLenovo);
    Keyboard keyboardLenovo = new Keyboard("Wireless", "Lenovo");
    System.out.println("Keyboard Details: " + keyboardLenovo);
    Monitor monitorLenovo = new Monitor("Lenovo", 27);
    System.out.println("Monitor Details: " + monitorLenovo);
    Computer computer1 = new Computer("ThinkPad", monitorLenovo, keyboardLenovo, mouseLenovo );
    System.out.println("Computer Details: " + computer1);
  }
}
