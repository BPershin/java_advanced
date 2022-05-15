package Calc_in_OOP;

public class Multiplication extends BaseOperation {
    public Multiplication(float firstNum, float secondNum) {
        super(firstNum, secondNum);
    }

    public float evaluate() {
        return this.firstNum * this.secondNum;
    }
}

