package org.example;

public class Ship {
    private String name;
    private double length;
    private double tonnage;

    public Ship() {
        this.name = "Неизвестно";
        this.length = 0;
        this.tonnage = 0;
    }

    public Ship(String name, double length, double tonnage) {
        this.name = name;
        this.length = length;
        this.tonnage = tonnage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getTonnage() {
        return tonnage;
    }

    public void setTonnage(double tonnage) {
        this.tonnage = tonnage;
    }

    public static void main(String[] args) {
        Ship[] ships = new Ship[5];
        ships[0] = new Ship("Аврора", 126.8, 6731);
        ships[1] = new Ship("Титаник", 269.1, 52310);
        ships[2] = new Ship("Виктория", 100.0, 5000);
        ships[3] = new Ship("Бисмарк", 251.0, 50900);
        ships[4] = new Ship("Куин Мэри", 310.0, 81237);

        Ship longest = ships[0];
        for (int i = 1; i < ships.length; i++) {
            if (ships[i].getLength() > longest.getLength()) {
                longest = ships[i];
            }
        }

        Ship heaviest = ships[0];
        for (int i = 1; i < ships.length; i++) {
            if (ships[i].getTonnage() > heaviest.getTonnage()) {
                heaviest = ships[i];
            }
        }

        System.out.println("Самый длинный корабль: " + longest.getName()
                + " (длина " + longest.getLength() + " м)");
        System.out.println("Максимальное водоизмещение: " + heaviest.getName()
                + " (" + heaviest.getTonnage() + " т)");
    }
}