package Calc_in_OOP;

import java.util.HashMap;

public class Executor {
    public static void main(String[] args) {

        NumbersListener num = new NumbersListener();
        OperatorListener operator = new OperatorListener();

        float firstNum = num.GetNumber();
        float secondNum = num.GetNumber();
        char op = operator.GetOperator();
        HashMap<Character, Object> map = new HashMap<Character, Object>() {
            {
                put('+', new Addition(firstNum, secondNum).evaluate());
                put('-', new Subtraction(firstNum, secondNum).evaluate());
                put('*', new Multiplication(firstNum, secondNum).evaluate());
                put('/', new Division(firstNum, secondNum).evaluate());
            }
        };
        Object obj = map.get(op);
        System.out.println(obj);
    }
}
