package org.example;

public class Robot {
    private String model;
    private String function;
    private int batteryLife;

    private static int totalRobots = 0;
    private static int totalBatteryLife = 0;

    public Robot() {
        this.model = "Неизвестно";
        this.function = "Неизвестно";
        this.batteryLife = 0;
        totalRobots = totalRobots + 1;
        totalBatteryLife = totalBatteryLife + batteryLife;
    }

    public Robot(String model, String function, int batteryLife) {
        this.model = model;
        this.function = function;
        this.batteryLife = batteryLife;
        totalRobots = totalRobots + 1;
        totalBatteryLife = totalBatteryLife + batteryLife;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public static double getAverageBatteryLife() {
        if (totalRobots == 0) {
            return 0;
        }
        return (double) totalBatteryLife / totalRobots;
    }
        public static void printInfo(Robot r){
            System.out.println(r.model);
            System.out.println(r.function);
            System.out.println(r.batteryLife);
        }
    }

