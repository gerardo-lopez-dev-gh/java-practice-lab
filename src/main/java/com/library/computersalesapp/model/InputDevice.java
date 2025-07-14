package com.library.computersalesapp.model;

public class InputDevice {
    private String inputType;
    private String brand;

    public String getInputType() {
        return inputType;
    }

    public InputDevice(String inputType, String brand) {
        this.inputType = inputType;
        this.brand = brand;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "InputDevice{" +
                "inputType='" + inputType + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
