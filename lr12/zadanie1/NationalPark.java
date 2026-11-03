package org.example;

public class NationalPark extends Park {
    private int visitors;

    public NationalPark(String name, int id, int rating, int visitors) {
        super(name, id, rating);
        this.visitors = visitors;
    }

    @Override
    public String toString() {
        return super.toString() + ", Посетители: " + visitors;
    }
}
