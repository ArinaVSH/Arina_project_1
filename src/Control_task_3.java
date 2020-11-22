import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Control_task_3 {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара: ");
        double x = in.nextDouble();
        System.out.print("Введите количество рублей: ");
        double y = in.nextDouble();
        double value = y/x;
        BigDecimal result = new BigDecimal(value);
        result = result.setScale(2, RoundingMode.DOWN);
        System.out.println("Итого " + result + " долларов");
    }
}
