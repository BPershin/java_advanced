package Calc_new;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;
public class ValueListener {
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());
    public static double GetNumber() throws InputMismatchException {
        System.out.println("Введите число: ");
        double number = 0;
        try {
            number = scanner.nextDouble();
            return number;
        } catch (InputMismatchException ex) {
            System.out.println(ex + "\n" + "Вы ввели не double, попробуйте еще раз");
            scanner.next();
            number = GetNumber();
            return number;
        }
    }
}


