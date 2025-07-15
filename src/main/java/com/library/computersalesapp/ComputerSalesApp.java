package com.library.computersalesapp;

import com.library.computersalesapp.model.Computer;
import com.library.computersalesapp.model.Keyboard;
import com.library.computersalesapp.model.Monitor;
import com.library.computersalesapp.model.Mouse;
import com.library.computersalesapp.service.Order;

public class ComputerSalesApp {
  public static void main(String[] args) {
    Mouse mouseLenovo = new Mouse("Wireless", "Lenovo");
    Keyboard keyboardLenovo = new Keyboard("Wireless", "Lenovo");
    Monitor monitorLenovo = new Monitor("Lenovo", 27);
    Computer computer1 = new Computer("ThinkPad", monitorLenovo, keyboardLenovo, mouseLenovo );
    Mouse mouseHP = new Mouse("Wireless", "HP");
    Keyboard keyboardHP = new Keyboard("Wireless", "HP");
    Monitor monitorHP = new Monitor("HP", 27);
    Computer computer2 = new Computer("Pavilion", monitorHP, keyboardHP, mouseHP );
    Mouse mouseHP2 = new Mouse("Wireless", "HP");
    Keyboard keyboardHP2 = new Keyboard("Wireless", "HP");
    Monitor monitorHP2 = new Monitor("HP", 27);
    Computer computer3 = new Computer("Envy", monitorHP2, keyboardHP2, mouseHP2 );
    Order order1 = new Order();
    Order order2 = new Order();
    order1.addComputer(computer1);
    order1.addComputer(computer2);
    order1.showOrder();
    order2.addComputer(computer3);
    order2.showOrder();
  }
}
