import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        try {
            String input = getInputFromUser();
            System.out.println("Введенная строка: " + input);
        } catch (Exception e) {
            System.out.println("Пустые строки вводить нельзя!");
        }
    }

    public static String getInputFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        if (input.isEmpty()) {
            throw new Exception();
        }
        return input;
    }
}
