package Calc_new;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculator() {
        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation(double val1, double val2, char operation) {
        Operation operationMapValue = operationMap.get(operation);
        return operationMapValue.calculate(val1, val2);
    }
}

