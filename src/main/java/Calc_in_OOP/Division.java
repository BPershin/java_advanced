package Calc_in_OOP;

public class Division extends BaseOperation {
    public Division(float firstNum, float secondNum) {
        super(firstNum, secondNum);
    }

    public float evaluate() {
        return this.firstNum / this.secondNum;
    }
}

