package com.library.computersalesapp.service;

import com.library.computersalesapp.model.Computer;
import java.util.List;

public class Order {
    private final int idOrder;
    private final List<Computer> computerList;
    private static int orderCount = 0;

    public Order() {
        this.idOrder = ++orderCount;
        this.computerList = new java.util.ArrayList<>();
    }

    public void addComputer(Computer computer) {
        if (computer != null) {
            computerList.add(computer);
        } else {
            throw new IllegalArgumentException("Computer cannot be null");
        }
    }

    public void showOrder() {
        System.out.println("Order ID: " + idOrder);
        if (computerList.isEmpty()) {
            System.out.println("No computers in this order.");
        } else {
            System.out.println("Computers in this order:");
            for (Computer computer : computerList) {
                System.out.println(computer);
            }
        }
    }
}
