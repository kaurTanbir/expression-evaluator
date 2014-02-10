import tanbirka.expressionEvaluator.api.Evaluator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class EvaluatorTest {
    @Test
    public void testGivesAdditionOfTwoNumbers() throws Exception {
        String input = "2 + 3";
        Evaluator evaluator = new Evaluator();
        double expected = 5;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesDifferenceOfTwoNumbers() throws Exception {
        String input = "5 - 3";
        Evaluator evaluator = new Evaluator();
        double expected = 2;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSubtractionOfGreaterNumberFromSmaller() throws Exception {
        String input = "2 - 3";
        Evaluator evaluator = new Evaluator();
        double expected = -1;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesProductOfTwoNumbers() throws Exception {
        String input = "5 * 3";
        Evaluator evaluator = new Evaluator();
        double expected = 15;

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
        double expected = 4;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSumOfMultipleNumber() throws Exception {
        String input = "2 + 2 + 3";
        Evaluator evaluator = new Evaluator();
        double expected = 7;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSumOfMultipleNumberAndMultipleOperators() throws Exception {
        String input = "2 + 2 - 3";
        Evaluator evaluator = new Evaluator();
        double expected = 1;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesResultOfMultipleOperationsOnMultipleNumbers() throws Exception {
        String input = "2 + 2 - 3 * 5 / 5";
        Evaluator evaluator = new Evaluator();
        double expected = 1;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesResultOfMultipleOperation() throws Exception {
        String input = "2 ^ 2 + 4 - 8";
        Evaluator evaluator = new Evaluator();
        double expected = 0;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesSameNumberIfOnlyOneNumberInExpression() throws Exception {
        String input = "2";
        Evaluator evaluator = new Evaluator();
        double expected = 2;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testGivesResultOfExpressionWithOneParenthesis() throws Exception {
        String input = "2 + ( 3 - 2 )";
        Evaluator evaluator = new Evaluator();
        double expected = 3;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingMultiplePairsOfBrackets() {
        String input = "1 + ( 2 * 12 ) - ( 4 ^ 2 )";
        Evaluator evaluator = new Evaluator();
        double expected = 9;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingMultiplePairOfBracketsInSingleExpression() {
        String input = "1 + ( 2 * 12 ) - ( 5 * 5 )";
        Evaluator evaluator = new Evaluator();
        double expected = 0;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingNestedBrackets() {
        String input = "1 + ( 2 * ( 12 - 2 ) ) - ( 5 * 5 )";
        Evaluator evaluator = new Evaluator();
        double expected = -4;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingDecimalNumbers() {
        String input = "1.5 + ( 2.5 * 4 ) - 5.5";
        Evaluator evaluator = new Evaluator();
        double expected = 6;
        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingNegativeNumbers() {
        String input = "1 + ( -2.5 * 4 ) + 5";
        Evaluator evaluator = new Evaluator();
        double expected = -4;
        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSolvesTheExpressionHavingNegativeNumber() {
        String input = "1 + -3 + 5";
        Evaluator evaluator = new Evaluator();
        double expected = 3;
        double actual = evaluator.evaluateExpression(input);
        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testSingleOerationWithSpaceBetweenLeftOperandAndOperationForAddition() {
        Evaluator evaluator = new Evaluator();
        double expected = 5;
        double actual = evaluator.evaluateExpression("2 +3");
        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testForMultipleSpace() {
        Evaluator evaluator = new Evaluator();
        double expected = 4;
        double actual = evaluator.evaluateExpression("2 +-3 --3*2");
        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testEvaluatesAExpressionWhereEverythingIsInBrackets() {
        String input = "(1+2+3)";
        Evaluator evaluator = new Evaluator();
        double expected = 6;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }

    @Test
    public void testSolvesNestedBracketExpressions() {
        String input = "( 2 * ( 4 / 2 + 5 ) - ( 2 ^ 2 ) + ( 12 + ( 12 / 3 ) ) )";
        Evaluator evaluator = new Evaluator();
        double expected = 26;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testEvaluatesExpressionHavingNegativeNumbers() {
        String input = "1.4 - -2.6";
        Evaluator evaluator = new Evaluator();
        double expected = 4.0;

        double actual = evaluator.evaluateExpression(input);

       assertEquals(expected, actual, 0.00);
    }

    @Test
    public void testEvaluatesExpressionHavingNegativeNumbersWithBrackets() {
        String input = "1.5 - -5.5 * ( 3.5 - -9.5 - ( 12.5 + -10.5 ) - -9 )";
        Evaluator evaluator = new Evaluator();
        double expected = 140;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }

    @Test
    public void testEvaluateAnExpressionWhichHaveNoSpace() {
        String input = "(2*(4/2+5)-(2^2)+(12+(12/3)))";
        Evaluator evaluator = new Evaluator();
        double expected = 26;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }

    @Test
    public void testEvaluatesExpressionHavingNegativeNumbersWithBracketsWithoutSpace() {
        String input = "1.5--5.5*(3.5--9.5-(12.5+-10.5)--9)";
        Evaluator evaluator = new Evaluator();
        double expected = 140;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }

    @Test
    public void testEvaluatesExpressionEitherItHasSpacesOrNot() {
        String input = "1.5--5.5 *(3.5--9.5-(12.5 +-10.5) --9)";
        Evaluator evaluator = new Evaluator();
        double expected = 140;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }

    @Test
    public void testEvaluatesExpressionStartWithNegativeNumber() {
        String input = "-15.5--5.5";
        Evaluator evaluator = new Evaluator();
        double expected = -10;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testEvaluatesExpressionStartWithNegativePowerOf() {
        String input = "-1^-1";
        Evaluator evaluator = new Evaluator();
        double expected = -1.0;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testEvaluatesExpressionOnlyOneNegativeNumberInBrackets() {
        String input = "((-1))";
        Evaluator evaluator = new Evaluator();
        double expected = -1;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testEvaluatesExpressionNegativeNumberInBrackets() {
        String input = "(1+((1)+(1)))";
        Evaluator evaluator = new Evaluator();
        double expected = 3;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
    @Test
    public void testEvaluatesExpressionNegativeNumber() {
        String input = "1.25 -- 0.25";
        Evaluator evaluator = new Evaluator();
        double expected = 1.5;

        double actual = evaluator.evaluateExpression(input);

        assertEquals(expected, actual, 0.00);
    }
}