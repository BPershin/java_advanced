import Calc_new.Calculator;
import Calc_new.ValueListener;
import org.junit.Assert;
import org.junit.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;

public class CalculatorTest {
     Calculator calc = new Calculator();
     ValueListener valueListener = new ValueListener();


     @Test
    public void AdditionWithoutPoint() {
        Assert.assertEquals(3,calc.makeCalculation(1,2,'+'),0);
    }
    @Test public void AdditionWithPoint() {
        Assert.assertEquals(3.1,calc.makeCalculation(3.0,0.1,'+'),0);
    }
    @Test public void SubstractionWithoutPoint() {
        Assert.assertEquals(15,calc.makeCalculation(18,3,'-'),0);
    }
    @Test public void SubstractionWithPoint() {
        Assert.assertEquals(5.986,calc.makeCalculation(6.12,0.134,'-'),0);
    }
    @Test public void MultWithPoint() {
        Assert.assertEquals(0.01608,calc.makeCalculation(0.12,0.134,'*'),0);
    }
    @Test public void MultWithoutPoint() {
        Assert.assertEquals(81,calc.makeCalculation(9,9,'*'),0);
    }
    @Test public void divWithoutPoint() {
        Assert.assertEquals(0.4,calc.makeCalculation(4,10,'/'),0);
    }
    @Test public void divWithPoint() {
        Assert.assertEquals(0.24,calc.makeCalculation(0.12,0.5,'/'),0);
    }
    @Test public void divByZero() {
        Assert.assertEquals(Infinity,calc.makeCalculation(0.13,0,'/'),0);
    }
}
