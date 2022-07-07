import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите число от 1 до 999");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int b;
            int n;
            try {

                n = Integer.parseInt(reader.readLine());
                b = String.valueOf(n).length();
            } catch (Exception e) {
                System.out.println("Неверный ввод");
                continue;
            }

            if (n < 1 || n > 999) {
                throw new IllegalArgumentException(" Вне диапазона ");

            }

            switch (b) {
                case 1:
                    System.out.print("Однозначное число");
                    break;
                case 2:
                    System.out.print("Двухзначное число");
                    break;
                case 3:
                    System.out.print("Трехзначное число");
                    break;
                default:
                    System.out.println("Неверный ввод");
                    continue;
            }
            if (n % 2 == 0) {
                System.out.println(" четное");
            } else System.out.println(" нечетное");
            break;
        }
    }
}
