import java.util.Scanner;
public class Task_6 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        double x = in.nextInt();
        System.out.print("Введите y: ");
        double y = in.nextInt();
        System.out.print("Введите z: ");
        double z = in.nextInt();
        double avr = (x+y+z)/3;
        System.out.println("Среднее арифметическое чисел x, y, z: " + avr);
        double i = avr/2;
        if (i > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
