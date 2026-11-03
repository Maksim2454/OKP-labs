package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Park> parks = new ArrayList<Park>();


        List<Integer> r1 = new ArrayList<Integer>();
        r1.add(5); r1.add(4); r1.add(5); r1.add(3);

        List<Integer> r2 = new ArrayList<Integer>();
        r2.add(2); r2.add(1); r2.add(2); r2.add(3);

        List<Integer> r3 = new ArrayList<Integer>();
        r3.add(4); r3.add(4); r3.add(5); r3.add(4);

        List<Integer> r4 = new ArrayList<Integer>();
        r4.add(5); r4.add(5); r4.add(4); r4.add(5);


        parks.add(new Park(1, "Центральный", "Минск", 4, r1));
        parks.add(new Park(2, "Городской", "Гомель", 3, r2));
        parks.add(new Park(3, "Юбилейный", "Брест", 4, r3));
        parks.add(new Park(4, "Солнечный", "Гродно", 5, r4));


        Iterator<Park> iterator = parks.iterator();
        while (iterator.hasNext()) {
            Park p = iterator.next();
            if (p.getAverageRating() < 3) {
                iterator.remove();
            }
        }


        for (int i = 0; i < parks.size(); i++) {
            Park p = parks.get(i);
            if (p.getAverageRating() >= 4) {
                p.setRating(p.getRating() + 1);
            }
        }


        System.out.println("Парки с рейтингом 5:");
        printParks(parks, 5);
        System.out.println();


        Comparator<Park> myComparator = new Comparator<Park>() {
            @Override
            public int compare(Park p1, Park p2) {
                if (p1.getAverageRating() < p2.getAverageRating()) {
                    return 1;
                } else if (p1.getAverageRating() > p2.getAverageRating()) {
                    return -1;
                } else {
                    return p1.getName().compareTo(p2.getName());
                }
            }
        };

        Collections.sort(parks, myComparator);

        System.out.println("Отсортированные парки:");
        for (int i = 0; i < parks.size(); i++) {
            Park p = parks.get(i);
            System.out.println("ID: " + p.getId() + ", Имя: " + p.getName() + ", Средний рейтинг: " + p.getAverageRating());
        }
    }


    public static void printParks(List<Park> parks, int rating) {
        for (int i = 0; i < parks.size(); i++) {
            if (parks.get(i).getRating() == rating) {
                System.out.println(parks.get(i).getName());
            }
        }
    }
}