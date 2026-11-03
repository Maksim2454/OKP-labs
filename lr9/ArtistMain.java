package org.example;

public class ArtistMain {
    public static void main(String[] args) {

        Artist[] artists = new Artist[5];


        artists[0] = new Singer("Анна", 28, "Поп", "Сопрано");
        artists[1] = new Singer("Иван", 35, "Рок", "Баритон");
        artists[2] = new Singer("Ольга", 24, "Джаз", "Меццо");
        artists[3] = new Dancer("Пётр", 22, "Брейк-данс", "Хип-хоп");
        artists[4] = new Dancer("Мария", 30, "Бальные танцы", "Вальс");


        for (int i = 0; i < artists.length; i++) {
            System.out.println("Артист №" + (i + 1));
            artists[i].displayInfo();
            artists[i].perform();
            System.out.println("Награды: " + artists[i].getAwards());
            System.out.println();
        }
    }
}