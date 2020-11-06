import java.util.Scanner;
public class Task_6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = in.nextInt();
        System.out.print("Введите y: ");
        int y = in.nextInt();
        System.out.print("Введите z: ");
        int z = in.nextInt();
        int avr = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел x, y, z: " + avr);
        int i = avr/2;
        if (i > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
