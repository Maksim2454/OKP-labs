import java.util.Scanner;

public class Main {


    static class Employee {
        String fullname;
        double salary;

        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }
    }


    static class Report {
        static void generateReport(Employee[] employees) {
            for (int i = 0; i < employees.length; i++) {
                System.out.printf("%-15s %.2f%n", employees[i].fullname, employees[i].salary);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания (1-4):");
        int choice = in.nextInt();
        in.nextLine();

        switch (choice) {
            case 1:

                System.out.println("Введите строку:");
                String s1 = in.nextLine();
                System.out.println("Подстрока: " + s1.substring(0, Math.min(5, s1.length())));
                break;

            case 2:

                System.out.println("Введите предложение:");
                String s2 = in.nextLine().trim();
                if (s2.isEmpty()) {
                    System.out.println("Количество слов: 0");
                } else {
                    System.out.println("Количество слов: " + s2.split("\\s+").length);
                }
                break;

            case 3:

                Employee[] employees = {
                        new Employee("Иванов", 1500.5),
                        new Employee("Петров", 2300.75),
                        new Employee("Сидоров", 1800.0)
                };
                System.out.println("Отчет о зарплате:");
                Report.generateReport(employees);
                break;

            case 4:

                System.out.println("Введите строку:");
                String s4 = in.nextLine();
                String[] parts = s4.split("\\s+");
                System.out.println("Найденные строки:");
                for (int i = 0; i < parts.length; i++) {
                    if (parts[i].matches("a\\d{1,3}a")) {
                        System.out.println(parts[i]);
                    }
                }
                break;

            default:
                System.out.println("Задание не реализовано");
        }
        in.close();
    }
}