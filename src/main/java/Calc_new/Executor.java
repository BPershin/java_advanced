package Calc_new;

public class Executor {
    public static void main(String[] args) {
        ValueListener listener = new ValueListener();
        OperatorListener opListener = new OperatorListener();
        double value1 = listener.GetNumber();
        double value2 = listener.GetNumber();
        char operator = opListener.GetOperator();
        Calculator calculator = new Calculator();
        double res = calculator.makeCalculation(value1,value2,operator);
        System.out.println(res);
    }
}
