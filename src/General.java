import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class General {
    public static void main(String[] args) {

        System.out.println("Программа запущена");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        while (true) {
            try {
                n = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Ошибка повторите ввод ");
            }
        }

        int[] arr = {5,6,7};
        try {
            Integer.parseInt("dsdsf");
            System.out.println("1 элемент массива = " + arr[5]);
            int result = 5 / n;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Ноль убери " + e);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println("Triable " + e);
        }
    }
}
