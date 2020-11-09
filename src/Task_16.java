import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task_16 {
    public static void main(String[] args) {
        String a;
        try (BufferedReader b = new BufferedReader(new FileReader("test.txt")))
        {
            while((a=b.readLine()) !=null) {
                System.out.println(a);
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
