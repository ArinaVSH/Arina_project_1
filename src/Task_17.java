import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_17 {
    public static void main(String[] args) {
        String a;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Чтобы остановить запись в файл, введите 'стоп'");
        try (FileWriter f = new FileWriter("test.txt")) {
            do {
                System.out.println("Введите строку: ");
                a = b.readLine();
                if (a.compareTo("стоп") == 0) break;
                a = a + "\r\n";
                f.write(a);
            } while (a.compareTo("стоп") != 0);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
