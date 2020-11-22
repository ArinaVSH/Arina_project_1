import java.util.Scanner;

public class Control_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String bin = in.next();
        int result = 0;
        int x = 1;
        for (int i = bin.length() - 1; i >=0; i--) {
            if (bin.charAt(i) == '1') {
                result += x;
            }
            x = x*2;
        }
        System.out.println("Число в десятичном формате: " + result);
    }
}