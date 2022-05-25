package Calc_last;

import java.util.InputMismatchException;

public class Executor {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        OperatorListener opListener = new OperatorListener();
        char operator = ' ';
        double left = 0;
        double right = 0;
        double result = 0;
        try {
            left = NumsListener.getNumber();
        } catch (InputMismatchException ex) {
            System.out.println(ex);
        }

        try {
            right = NumsListener.getNumber();
        } catch (InputMismatchException ex) {
            System.out.println(ex);
        }

        try {
            operator = opListener.GetOperator();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex);
        }
        try {
            result = calc.makeCalculation(left, right, operator);
        }
        catch (ArithmeticException ex) {
            System.out.println(ex);
        }
        System.out.println(result);
    }
}

