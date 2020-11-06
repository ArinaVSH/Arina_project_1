import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите number: ");
        int number = in.nextInt();
        switch (number) {
            case 1:
            case 3:
            case 5:
            System.out.println("Данное значение имеется в константах");
            break;
            default:
                System.out.println("Такой константы нет!");

        }
    }
}
