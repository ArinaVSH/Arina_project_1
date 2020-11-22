import java.util.Scanner;

public class Control_task_2 {
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
        System.out.println("Вывод отсортированного массива на экран: ");
        int temp, j;
        for (int x = 0; x < size-1; x++) {
            if (array[x] > array[x+1]){
                temp = array[x+1];
                array[x+1] = array[x];
                j=x;
                while (j>0 && temp < array[j-1]) {
                    array[j] = array[j-1];
                    j--;
                }
                array[j]=temp;
            }
        }
        for (temp = 0; temp < size; temp++) {
            System.out.print(" " + array[temp]);
        }
    }
}