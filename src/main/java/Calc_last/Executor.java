package Calc_last;

public class Executor {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        OperatorListener opListener = new OperatorListener();
        double left = NumsListener.getNumber();
        double right = NumsListener.getNumber();
        char operator = opListener.GetOperator();

        System.out.println(calc.makeCalculation(left, right, operator));
    }
}

