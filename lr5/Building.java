package org.example;

public class Building {
    private String address;
    private int floors;
    private double totalArea;

    public Building() {
        this.address = "Неизвестно";
        this.floors = 1;
        this.totalArea = 0;
    }

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double averageAreaPerFloor() {
        return totalArea / floors;
    }

    public static void main(String[] args) {
        Building b = new Building("ул. Ленина, 10", 5, 1200.0);
        System.out.println("Адрес: " + b.getAddress());
        System.out.println("Этажей: " + b.getFloors());
        System.out.println("Общая площадь: " + b.getTotalArea());
        System.out.println("Средняя площадь этажа: " + b.averageAreaPerFloor());
    }
}