import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Задайте количество строк матрицы: ");
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        System.out.println("Задайте количество столбцов матрицы: ");
        int n = in.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Заполните матрицу");
        for (int t = 0; t < m; t++) {
            for (int i = 0; i < n; i++) {
                System.out.println("Элемент с индексом №" + t + i + ": ");
                matrix[t][i] = in.nextInt();
            }
        }
        System.out.println("Вывод 1й строки матрицы, умноженной на 3, на экран: ");
        for (int t = 0; t < 1; t++) {
            for (int i = 0; i < n; i++) {
                System.out.print(" " + matrix[t][i] * 3);
            }
            System.out.println();
        }
    }
}