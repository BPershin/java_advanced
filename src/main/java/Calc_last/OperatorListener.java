package Calc_last;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class OperatorListener {
    public static Scanner scanner = new Scanner(System.in);
    private PrintStream printStream;

    public OperatorListener(InputStream inputStream, PrintStream printStream) {
        this.scanner = new Scanner(inputStream);
        this.printStream = printStream;
    }


    public OperatorListener() {
    }

    public char GetOperator() throws IllegalArgumentException {
        System.out.println("Введите математический оператор ( + , - , / , * ): ");
        char operator = ' ';
        if (scanner.hasNext()) {
            operator = scanner.next().charAt(0);
            switch (operator) {
                case '+':
                case '-':
                case '/':
                case '*': {
                    System.out.println("Вы выбрали операцию: " + operator);
                    break;
                }
                default:
                    System.out.println("Оператор не распознан, выполнен выход из программы");
                    throw new IllegalArgumentException();
            }
        }
        return operator;
    }
}
