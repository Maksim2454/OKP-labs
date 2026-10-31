import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вариант задания от 1 до 3");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите длину ребра куба:");
                double a = in.nextDouble();
                System.out.println("Площадь поверхности куба: " + 6 * a * a);
                break;

            case 2:
                System.out.println("Введите два числа и операцию (1 - +, 2 - -, 3 - *, 4 - /, 5 - %):");
                double x = in.nextDouble();
                double y = in.nextDouble();
                int op = in.nextInt();
                if (op == 1) {
                    System.out.println(x + y);
                } else if (op == 2) {
                    System.out.println(x - y);
                } else if (op == 3) {
                    System.out.println(x * y);
                } else if (op == 4) {
                    if (y == 0) {
                        System.out.println("Ошибка");
                    } else {
                        System.out.println(x / y);
                    }
                } else if (op == 5) {
                    if (y == 0) {
                        System.out.println("Ошибка");
                    } else {
                        System.out.println(x % y);
                    }
                } else {
                    System.out.println("Ошибка");
                }
                break;

            case 3:
                int secret = new Random().nextInt(100) + 1;
                int attempts = 0;
                int guess;
                System.out.println("Угадайте число от 1 до 100");
                while (true) {
                    guess = in.nextInt();
                    attempts++;
                    if (guess < secret) {
                        System.out.println("Больше");
                    } else if (guess > secret) {
                        System.out.println("Меньше");
                    } else {
                        System.out.println("Угадали! Попыток: " + attempts);
                        break;
                    }
                }
                break;

            default:
                System.out.println("Ошибка");
        }
        in.close();
    }
}