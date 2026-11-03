package org.example;

public class Park {
    private String name;
    private int id;
    private int rating;

    public Park(String name, int id, int rating) {
        this.name = name;
        this.id = id;
        this.rating = rating;
    }

    public String getName() { return name; }
    public int getId() { return id; }
    public int getRating() { return rating; }

    @Override
    public String toString() {
        return "ID: " + id + ", Название: " + name + ", Рейтинг: " + rating;
    }
}
