import java.util.Scanner;
public class Task_15 {
    public static void main(String[] args) {
        System.out.println("Задайте размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив");
        for (int i = 0; i < size; i++) {
            System.out.println("Элемент с индексом №" + i + ": ");
            array[i] = in.nextInt();
        }
        for (int i = array.length-1; i>0; i--) {
            for (int j = 0; j<i; j++) {
                if (array[j]>array[j+1]) {
                    int array1 = array[j];
                    array[j] = array[j+1];
                    array[j+1] = array1;
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i<array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }
}