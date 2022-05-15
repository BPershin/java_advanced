package Calc_in_OOP;

public class Addition extends BaseOperation {

    public Addition(float firstNum, float secondNum) {
        super(firstNum, secondNum);
    }

    public float evaluate() {
        return this.firstNum + this.secondNum;
    }
}
