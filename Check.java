import java.util.Scanner;

public class Check {

    // Метод для безопасного ввода double с клавиатуры
    public static double checkingInput(Scanner sc, String string) {
        while (true) {
            System.out.print(string);
            try {
                return Double.parseDouble(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка! Введите число.");
            }
        }
    }
}

