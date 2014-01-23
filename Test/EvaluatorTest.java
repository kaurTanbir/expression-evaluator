import org.junit.Test;
import tanbirka.expressionEvaluator.api.Evaluator;
import static org.junit.Assert.assertEquals;


public class EvaluatorTest {
    @Test
    public void testGivesAdditionOfTwoNumbers() throws Exception {
        String input = "2 + 3";
        Evaluator evaluator = new Evaluator();
        double expected = 5.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesDifferenceOfTwoNumbers() throws Exception {
        String input = "5 - 3";
        Evaluator evaluator = new Evaluator();
        double expected = 2.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSubtractionOfGreaterNumberFromSmaller() throws Exception {
        String input = "2 - 3";
        Evaluator evaluator = new Evaluator();
        double expected = -1.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesProductOfTwoNumbers() throws Exception {
        String input = "5 * 3";
        Evaluator evaluator = new Evaluator();
        double expected = 15.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesDividendOfTwoNumbers() throws Exception {
        String input = "22 / 3";
        Evaluator evaluator = new Evaluator();
        double expected = 7.333333333333333;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesPowerOfNumber() throws Exception {
        String input = "2 ^ 2";
        Evaluator evaluator = new Evaluator();
        double expected = 4.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSumOfMultipleNumber() throws Exception {
        String input = "2 + 2 + 3";
        Evaluator evaluator = new Evaluator();
        double expected = 7.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSumOfMultipleNumberAndMultipleOperators() throws Exception {
        String input = "2 + 2 - 3";
        Evaluator evaluator = new Evaluator();
        double expected = 1.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesResultOfMultipleOperationsOnMultipleNumbers() throws Exception {
        String input = "2 + 2 - 3 * 5 / 5";
        Evaluator evaluator = new Evaluator();
        double expected = 1.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesResultOfMultipleOperation() throws Exception {
        String input = "2 ^ 2 + 4 - 8";
        Evaluator evaluator = new Evaluator();
        double expected = 0.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSameNumberIfOnlyOneNumberInExpression() throws Exception {
        String input = "2";
        Evaluator evaluator = new Evaluator();
        double expected = 2.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesResultOfExpressionWithOneParenthesis() throws Exception {
        String input = "2 + ( 3 - 2 )";
        Evaluator evaluator = new Evaluator();
        double expected = 3.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingMultiplePairsOfBrackets() {
        String input = "1 + ( 2 * 12 ) - ( 4 ^ 2 )";
        Evaluator evaluator = new Evaluator();
        double expected = 9.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingMultiplePairOfBracketsInSingleExpression() {
        String input = "1 + ( 2 * 12 ) - ( 5 * 5 )";
        Evaluator evaluator = new Evaluator();
        double expected = 0.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingNestedBrackets() {
        String input = "1 + ( 2 * ( 12 - 2 ) ) - ( 5 * 5 )";
        Evaluator evaluator = new Evaluator();
        double expected = -4.00;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingDecimalNumbers() {
        String input = "1.5 + ( 2.5 * 4 ) - 5.5";
        Evaluator evaluator = new Evaluator();
        double expected = 6.00;
        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingNegativeNumbers() {
        String input = "1 + ( -2.5 * 4 ) + 5";
        Evaluator evaluator = new Evaluator();
        double expected = -4.00;
        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingNegativeNumber() {
        String input = "1 + -3 + 5";
        Evaluator evaluator = new Evaluator();
        double expected = 3.00;
        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }

}