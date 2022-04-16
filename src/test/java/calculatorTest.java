import calculator.calculator;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calculatorTest {
    private static final double delta = 1e-15;
    calculator mycalc = new calculator();

    @Test
    public void sqrootTesting() {
        assertEquals("Testing true positive for square root", 3.0, mycalc.sqroot(9.0), delta);
        assertEquals("Testing true negative for square root", Double.NaN, mycalc.sqroot(-25.0), delta);
        assertNotEquals("Testing false positives for square root", 5.0, mycalc.sqroot(16.0), delta);
        assertNotEquals("Testing false negative for square root", 3.0, mycalc.sqroot(-24.0), delta);
    }

    @Test
    public void factorialTesting() {
        assertEquals("Testing true positive for factorial", 120.0, mycalc.fact(5.0), delta);
        assertEquals("Testing true negative for factorial", Double.NaN, mycalc.fact(-1.0), delta);
        assertNotEquals("Testing false positives for factorial", 24, mycalc.fact(5.0), delta);
        assertNotEquals("Testing false negative for factorial", 6.0, mycalc.fact(-1.0), delta);
    }

    @Test
    public void logarithmTesting() {
        assertEquals("Testing true positive for logarithm", 2.302585092994046, mycalc.logarithm(10.0), delta);
        assertEquals("Testing true negative for logarithm", Double.NaN, mycalc.logarithm(-5.0), delta);
        assertNotEquals("Testing false positives for logarithm", 20.0, mycalc.logarithm(26.0), delta);
        assertNotEquals("Testing false negative for logarithm", 6.0, mycalc.logarithm(-6.0), delta);
    }

    @Test
    public void powerTesting() {
        assertEquals("Testing true positive for power", 8.0, mycalc.power(2.0, 3.0), delta);
        assertEquals("Testing true negative for power", 0.5, mycalc.power(2.0, -1.0), delta);
        assertNotEquals("Testing false positive for power", 6.0, mycalc.power(2.0, 3.0), delta);
        assertNotEquals("Testing false negative for power", 1.0, mycalc.power(2.0, -3.0), delta);
    }
}