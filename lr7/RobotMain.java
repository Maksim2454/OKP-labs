package org.example;

public class RobotMain {
    public static void main(String[] args) {
        Robot robot1 = new Robot("R2-D2", "Астромеханический дроид", 48);
        Robot robot2 = new Robot("C-3PO", "Протокольный дроид", 72);
        Robot robot3 = new Robot("Валли", "Уборщик", 24);
        Robot robot4 = new Robot("Термо", "Боевой робот", 120);

        Robot.printInfo(robot1);
        Robot.printInfo(robot2);
        Robot.printInfo(robot3);
        Robot.printInfo(robot4);

        System.out.println("Среднее время работы батареи: " + Robot.getAverageBatteryLife() + " часов");
    }
}