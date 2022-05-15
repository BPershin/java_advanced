package Calc_in_OOP;

public class Value implements Evalueable {
    private float value;

    public void setValue(float value) {
        this.value = value;
    }

    public float evaluate() {
        return value;
    }
}
