import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        float number = getFloatFromUser();
        System.out.println("Введенное число: " + number);
    }

    public static float getFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                return scanner.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Неверный формат числа. Повторите ввод.");
                scanner.nextLine(); // Очистка ввода
            }
        }
    }
}