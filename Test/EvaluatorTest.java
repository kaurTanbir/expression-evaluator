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
}
