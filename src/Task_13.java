import javax.swing.*;
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ю строку: ");
        String str1 = in.nextLine();
        int len1 = str1.length();
        System.out.println("Введите 2-ю строку: ");
        String str2 = in.nextLine();
        int len2 = str2.length();
        if (len1 > len2) {
            System.out.println("Строка с наибольшей длиной: " + str1);
        } else if (len1 < len2) {
            System.out.println("Строка с наибольшей длиной: "  + str2);
        } else {
            System.out.println("Строки совпадают по длине.");
        }
    }
}
