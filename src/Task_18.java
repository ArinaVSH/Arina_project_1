import java.io.*;

public class Task_18 {
    public static void main(String[] args) {
        String str1;
        int read = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt")))
        {
            while((str1=br.readLine()) !=null) {
                System.out.println(str1);
                read++;
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
        String str2;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try (FileWriter f = new FileWriter("test.txt")) {
            for (int i = 0; i<read; i++) {
                System.out.println("Введите строку для записи в файл: ");
                str2 = b.readLine();
                f.write(str2 + "\r\n");
            }
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода: " + ex);
        }
    }
}
