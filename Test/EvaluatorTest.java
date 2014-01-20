import tanbirka.expressionEvaluator.api.Evaluator;
import org.junit.Test;
import org.junit.Assert;

public class EvaluatorTest {
    @Test
    public void testGetExpression() throws Exception {
        String input = "2 + 3";
        String expected = "2 + 3";
        Evaluator evaluator = new Evaluator();
        String actual = evaluator.getExpression(input);
        Assert.assertEquals(expected,actual);
    }
}
