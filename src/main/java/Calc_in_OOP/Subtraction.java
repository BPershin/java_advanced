package Calc_in_OOP;

public class Subtraction extends BaseOperation {
    public Subtraction(float firstNum, float secondNum) {
        super(firstNum, secondNum);
    }

    public float evaluate() {
        return this.firstNum - this.secondNum;
    }
}

