package com.library.computersalesapp.model;

public class Computer {
    private final int idComputer;
    private String name;
    private Monitor monitor;
    private Keyboard keyboard;
    private Mouse mouse;
    private static int computerCount;

    private Computer() {
        this.idComputer = ++computerCount; // Increment the count and assign it to idComputer
    }

    public Computer(String name, Monitor monitor, Keyboard keyboard, Mouse mouse) {
        this(); // Call the private constructor to initialize idMonitor
        this.name = name;
        this.monitor = monitor;
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computer{\n" +
                "idComputer=" + idComputer +
                ", name='" + name + '\'' +
                ",\n monitor=" + monitor +
                ",\n keyboard=" + keyboard +
                ",\n mouse=" + mouse +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }
}
