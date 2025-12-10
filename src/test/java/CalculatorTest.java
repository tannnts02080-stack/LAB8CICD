import org.testng.Assert;
import org.testng.annotations.Test;

import Caculator.Calculator;

public class CalculatorTest {

    Calculator c = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(c.add(2, 3), 5);
    }

    @Test
    public void testSub() {
        Assert.assertEquals(c.sub(5, 3), 2);
    }
}
