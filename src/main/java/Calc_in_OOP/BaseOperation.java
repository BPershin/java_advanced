package Calc_in_OOP;

import java.util.HashMap;

public abstract class BaseOperation implements Evalueable {
    protected float firstNum;
    protected float secondNum;

    public BaseOperation(float firstNum, float secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
}
