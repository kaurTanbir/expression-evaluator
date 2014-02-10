package tanbirka.expressionEvaluator.api;

import org.junit.Assert;
import org.junit.Test;

public class OperationsTest {
    @Test
    public void testGivesAdditionOfTwoNumbersWhenOperatorIsPlus() throws Exception {
        Operations operations = new Operations();
        double expected = 3;

        double actual = operations.operate("+", 1, 2);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesSubstractionOfTwoNumbersWhenOperatorIsMinus() throws Exception {
        Operations operations = new Operations();
        double expected = -10;

        double actual = operations.operate("-", 10, 20);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesMultiplicationOfTwoNumbersWhenOperatorIsInto() throws Exception {
        Operations operations = new Operations();
        double expected = 10;

        double actual = operations.operate("*", 5, 2);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesDivisionOfTwoNumbersWhenOperatorIsDivide() throws Exception {
        Operations operations = new Operations();
        double expected = 4;

        double actual = operations.operate("/", 20, 5);

        Assert.assertEquals(expected, actual, 1);
    }

    @Test
    public void testGivesPowerOfTwoNumbersWhenOperatorIsCarrat() throws Exception {
        Operations operations = new Operations();
        double expected = 16;

        double actual = operations.operate("^", 4, 2);

        Assert.assertEquals(expected, actual, 1);
    }
}
