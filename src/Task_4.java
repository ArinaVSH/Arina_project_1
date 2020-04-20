import java.util.Scanner;
public class Task_4 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String bin = in.next();
        int num = Integer.parseInt(bin, 2);
        System.out.println("Число в десятичном формате: " + num);
    }
}
