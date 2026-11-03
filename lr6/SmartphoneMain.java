package org.example;

public class SmartphoneMain {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone("Samsung", 6.5, 12);

        System.out.println("Бренд: " + phone.getBrand());
        System.out.println("Диагональ экрана: " + phone.getScreenSize());
        System.out.println("Время работы батареи: " + phone.getBatteryLife() + " часов");

        if (phone.isGoodBattery()) {
            System.out.println("Батарея хорошая (больше 10 часов).");
        } else {
            System.out.println("Батарея слабая (10 часов или меньше).");
        }
    }
}