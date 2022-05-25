package Calc_last;

public class Calculator {
    double left;
    double right;
    char operator;

    public Calculator(double left, double right, char operator) {
        super();
        this.left = left;
        this.right = right;
        this.operator = operator;
    }

    public Calculator() {

    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public char getOperator() {
        return operator;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public static double makeCalculation(double left, double right, char operator) {
        double result = 0;
        switch (operator) {
            case '+':
                result = left + right;
                break;
            case '-':
                result = left - right;
                break;
            case '*':
                result = left * right;
                break;
            case '/':
                if (right == 0) {
                    throw new ArithmeticException("Вы попытались разделить на 0, программа завершена");
                }
                result = left / right;
                break;
        }
        return result;
    }
}
