package org.example;

public class CityPark extends Park {
    private double area;

    public CityPark(String name, int id, int rating, double area) {
        super(name, id, rating);
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Площадь: " + area;
    }
}
