import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args) {
        System.out.println("Задайте размер массива: ");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив");
        for (int i = 0; i<size; i++) {
            System.out.println("Элемент с индексом №"+i+": ");
            array[i]=in.nextInt();
        }
       System.out.println("Вывод удвоенного массива на экран: ");
        for (int i = 0; i<size; i++) {
            System.out.print(" " + array[i]*2);
        }

    }
}