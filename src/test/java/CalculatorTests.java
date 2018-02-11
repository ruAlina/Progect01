import org.junit.Assert;
import org.junit.Test;
import ru.alina.Calculator;
import ru.alina.MaxElementFinder;

import java.lang.reflect.Array;

public class CalculatorTests {
    @Test
    public void testCalculatorSum() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(3.98765, -18.5), -14.5124, 1.0E-4);
    }

    @Test
    public void testCalculatorResidual() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.residual(3.8433222655, 18.0001), -14.1568, 1.0E-4);
    }

    @Test
    public void testCalculatorProduct00() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.product(-3, -10.99877666), 32.9963, 1.0E-4);
    }

    @Test

    public void testCalculatorProduct01() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.product(0, -10), 0, 1.0E-4);
    }

    @Test
    public void testCalculatorQuotient00() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.quotient(30, 18), 1.6667, 1.0E-4);
    }
    @Test
    public void testCalculatorQuotient01() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.quotient(30, 0), Double.POSITIVE_INFINITY , 1.0E-4);
    }

    @Test
    public void testMaxElementFinder() {
        String[] elem = {"tytu", "крошки", "ouhkljlkjouo", "h78787hg"};
        MaxElementFinder finder = new MaxElementFinder();
        Assert.assertEquals(finder.get(elem), "ouhkljlkjouo");
    }


}
