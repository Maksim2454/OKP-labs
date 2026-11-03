package org.example;

public class ThemePark extends Park {
    private int attractions;

    public ThemePark(String name, int id, int rating, int attractions) {
        super(name, id, rating);
        this.attractions = attractions;
    }

    @Override
    public String toString() {
        return super.toString() + ", Аттракционы: " + attractions;
    }
}
