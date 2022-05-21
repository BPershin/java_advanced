package Calc_new;

public class Division implements Operation {

    @Override
    public double calculate(double left, double right) throws IllegalArgumentException {
        try {
            return left / right;

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

}

