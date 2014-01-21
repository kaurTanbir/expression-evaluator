package tanbirka.expressionEvaluator.api;

public class Evaluator {
    public int evaluateExpression(String expression) {
        String[] values = expression.split(" ");
        String operator = values[1];

        int operand1 = Integer.parseInt(values[0]);
        int operand2 = Integer.parseInt(values[2]);

        Operations operationsMap = new Operations();
        return operationsMap.operate(operator, operand1, operand2);
    }
}



