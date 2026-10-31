import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вариант задания (1 или 2)");
        int choice = in.nextInt();

        switch (choice) {
            case 1:
                
                System.out.println("Введите размер массива:");
                int n = in.nextInt();
                int[] arr = new int[n];
                System.out.println("Введите элементы массива:");
                for (int i = 0; i < n; i++) {
                    arr[i] = in.nextInt();
                }
                int max = arr[0];
                int min = arr[0];
                for (int i = 1; i < n; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                    }
                    if (arr[i] < min) {
                        min = arr[i];
                    }
                }
                System.out.println("Разница между max и min: " + (max - min));
                break;

            case 2:
              
                System.out.println("Введите размер квадратной матрицы N:");
                int N = in.nextInt();
                int[][] matrix = new int[N][N];
                System.out.println("Введите элементы матрицы:");
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        matrix[i][j] = in.nextInt();
                    }
                }
                int maxVal = matrix[0][0];
                int minVal = matrix[0][0];
                int maxSumIdx = 0;
                int minSumIdx = 0;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        int val = matrix[i][j];
                        int sumIdx = i + j;
                        if (val > maxVal) {
                            maxVal = val;
                            maxSumIdx = sumIdx;
                        } else if (val == maxVal) {
                            if (sumIdx > maxSumIdx) {
                                maxSumIdx = sumIdx;
                            }
                        }
                        if (val < minVal) {
                            minVal = val;
                            minSumIdx = sumIdx;
                        } else if (val == minVal) {
                            if (sumIdx < minSumIdx) {
                                minSumIdx = sumIdx;
                            }
                        }
                    }
                }
                System.out.println("Максимальный элемент: " + maxVal + " (сумма индексов: " + maxSumIdx + ")");
                System.out.println("Минимальный элемент: " + minVal + " (сумма индексов: " + minSumIdx + ")");
                break;

            default:
                System.out.println("Ошибка: введите 1 или 2");
        }
        in.close();
    }
}