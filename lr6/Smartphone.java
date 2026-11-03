package org.example;

public class Smartphone {
    private String brand;
    private double screenSize;
    private int batteryLife;

    public Smartphone() {
        this.brand = "Неизвестно";
        this.screenSize = 0;
        this.batteryLife = 0;
    }

    public Smartphone(String brand, double screenSize, int batteryLife) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isGoodBattery() {
        return batteryLife > 10;
    }
}