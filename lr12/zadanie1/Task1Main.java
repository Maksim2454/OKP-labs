package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1Main {
    public static void main(String[] args) {
        Map<String, Park> parks = new HashMap<>();

        parks.put("Центральный", new CityPark("Центральный", 1, 4, 15.5));
        parks.put("Городской", new CityPark("Городской", 2, 3, 10.0));
        parks.put("Юбилейный", new CityPark("Юбилейный", 3, 5, 20.2));

        parks.put("Беловежская пуща", new NationalPark("Беловежская пуща", 4, 5, 10000));
        parks.put("Нарочанский", new NationalPark("Нарочанский", 5, 4, 5000));
        parks.put("Припятский", new NationalPark("Припятский", 6, 4, 3000));

        parks.put("Дримлэнд", new ThemePark("Дримлэнд", 7, 5, 25));
        parks.put("Парк чудес", new ThemePark("Парк чудес", 8, 4, 15));


        List<String> keys = new ArrayList<>(parks.keySet());


        for (int i = 0; i < keys.size(); i++) {
            String key = keys.get(i);
            Park value = parks.get(key);
            System.out.println("Ключ: " + key + " | Значение: " + value);
        }
    }
}
