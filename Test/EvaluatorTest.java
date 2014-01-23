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
    @Test
    public void testGivesDividendOfTwoNumbers() throws Exception {
        String input = "66 / 3";
        Evaluator evaluator = new Evaluator();
        int expected = 22;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesPowerOfNumber() throws Exception {
        String input = "2 ^ 2";
        Evaluator evaluator = new Evaluator();
        int expected = 4;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesSumOfMultipleNumber() throws Exception {
        String input = "2 + 2 + 3";
        Evaluator evaluator = new Evaluator();
        int expected = 7;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesSumOfMultipleNumberAndMultipleOperators() throws Exception {
        String input = "2 + 2 - 3";
        Evaluator evaluator = new Evaluator();
        int expected = 1;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesResultOfMultipleOperationsOnMultipleNumbers() throws Exception {
        String input = "2 + 2 - 3 * 5 / 5";
        Evaluator evaluator = new Evaluator();
        int expected = 1;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesResultOfMultipleOperation() throws Exception {
        String input = "2 ^ 2 + 4 - 8";
        Evaluator evaluator = new Evaluator();
        int expected = 0;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesSameNumberIfOnlyOneNumberInExpression() throws Exception {
        String input = "2";
        Evaluator evaluator = new Evaluator();
        int expected = 2;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGivesResultOfExpressionWithOneParenthesis() throws Exception {
        String input = "2 + ( 3 - 2 )";
        Evaluator evaluator = new Evaluator();
        int expected = 3;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSolvesTheExpressionHavingMultiplePairsOfBrackets() {
        String input = "1 + ( 2 * 12 ) - ( 4 ^ 2 )";
        Evaluator evaluator = new Evaluator();
        int expected = 9;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSolvesTheExpressionHavingMultiplePairOfBracketsInSingleExpression() {
        String input = "1 + ( 2 * 12 ) - ( 5 * 5 )";
        Evaluator evaluator = new Evaluator();
        int expected = 0;

        int actual = evaluator.evaluateExpression(input);

        Assert.assertEquals(expected, actual);
    }


}
