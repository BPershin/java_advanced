package Calc_last;

import java.util.Scanner;

public class OperatorListener {
    public static Scanner scanner = new Scanner(System.in);

    public char GetOperator() {
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
                    System.out.println("Оператор не распознан, попробуйте еще раз!");
                    operator = GetOperator();
                    break;
            }
        }
        return operator;
    }
}
