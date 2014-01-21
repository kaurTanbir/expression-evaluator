import tanbirka.expressionEvaluator.api.Evaluator;
import org.junit.Test;
import org.junit.Assert;

public class EvaluatorTest {
    @Test
    public void testGivesAdditionOfTwoNumbers() throws Exception {
        String input = "2 + 3";
        Evaluator evaluator = new Evaluator();
        int expected = 5;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesDifferenceOfTwoNumbers() throws Exception {
        String input = "5 - 3";
        Evaluator evaluator = new Evaluator();
        int expected = 2;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesSubtractionOfGreaterNumberFromSmaller() throws Exception {
        String input = "2 - 3";
        Evaluator evaluator = new Evaluator();
        int expected = -1;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesProductOfTwoNumbers() throws Exception {
        String input = "5 * 3";
        Evaluator evaluator = new Evaluator();
        int expected = 15;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
}
