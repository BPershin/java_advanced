package Calc_last;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumsListener {
    public static Scanner scanner = new Scanner(System.in);
    private PrintStream printStream;

    public NumsListener() {
    }

    public NumsListener(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }

    public static double getNumber() throws InputMismatchException {
        System.out.println("Введите число: ");
        double number = 0;
        try {
            number = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            System.out.println("Вы ввели не double " + ex);
            scanner.next();
            number = getNumber();
        }
        return number;
    }
}
