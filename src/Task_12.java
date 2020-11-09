import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String input12 = in.nextLine();
        char[] chArray = input12.toCharArray();
        System.out.println("Строка без пробелов: ");
        for (int i = 0; i < chArray.length; i++) {
            if (input12.charAt(i) != ' ') {
                System.out.print(chArray[i]);
            }
        }
    }
}