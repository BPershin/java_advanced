import Calc_last.Calculator;
import Calc_last.NumsListener;
import com.sun.org.glassfish.gmbal.Description;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static Calc_last.Calculator.makeCalculation;
import static org.junit.Assert.assertThrows;

public class Calc_last_test {
    NumsListener listener = new NumsListener();
    public static Calculator calc = new Calculator();

    @Test
    @Description("Бросает исключение когда мы вводим не double, или double но с точкой, вместо запятой")
    public void exceptionShouldBeThrownWhenInputNotDouble() {
        ByteArrayInputStream inputStream = new ByteArrayInputStream("0.1".getBytes());
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        NumsListener userInput = new NumsListener(inputStream, ps);
        assertThrows(Exception.class,
                () -> {
                    userInput.getNumber();
                });
    }

    @Test
    @Description("Бросает исключение когда мы делим на ноль")
    public void exceptionShouldBeThrownWhenDividedByZero() {
        assertThrows(ArithmeticException.class,
                () -> {
                    calc.makeCalculation(1, 0, '/');
                });
    }

    @Test
    public void AdditionWithoutPoint() {
        Assert.assertEquals(5, makeCalculation(2, 3, '+'), 0);
    }

    @Test
    public void SubstractionWithoutPoint() {
        Assert.assertEquals(15, makeCalculation(18, 3, '-'), 0);
    }

    @Test
    public void SubstractionWithPoint() {
        Assert.assertEquals(5.986, makeCalculation(6.12, 0.134, '-'), 0);
    }

    @Test
    public void MultWithPoint() {
        Assert.assertEquals(0.01608, makeCalculation(0.12, 0.134, '*'), 0);
    }

    @Test
    public void MultWithoutPoint() {
        Assert.assertEquals(81, makeCalculation(9, 9, '*'), 0);
    }

    @Test
    public void divWithoutPoint() {
        Assert.assertEquals(0.4, makeCalculation(4, 10, '/'), 0);
    }

    @Test
    public void divWithPoint() {
        Assert.assertEquals(0.24, makeCalculation(0.12, 0.5, '/'), 0);
    }
}


