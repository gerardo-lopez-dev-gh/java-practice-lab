package com.library.computersalesapp.model;

public class Monitor {
  private final int idMonitor;
  private String brand;
  private double sizeInInches;
  private static int monitorCount;

  private Monitor() {
    this.idMonitor = ++monitorCount;
  }

  public Monitor(String brand, double sizeInInches) {
    this(); // Call the private constructor to initialize idMonitor
    this.brand = brand;
    this.sizeInInches = sizeInInches;
  }

  @Override
  public String toString() {
    return "Monitor{" +
            "idMonitor=" + idMonitor +
            ", brand='" + brand + '\'' +
            ", sizeInInches=" + sizeInInches +
            '}';
  }

  public int getIdMonitor() {
    return idMonitor;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public double getSizeInInches() {
    return sizeInInches;
  }

  public void setSizeInInches(double sizeInInches) {
    this.sizeInInches = sizeInInches;
  }
}
