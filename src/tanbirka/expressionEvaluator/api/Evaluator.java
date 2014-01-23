package tanbirka.expressionEvaluator.api;

import java.util.ArrayList;
import java.util.List;

public class Evaluator {

    public int evaluateExpression(String expression) {
        String expressionToEval = expression;
        if (expression.contains("(")){
            expressionToEval = solveBrackets(expression);
            return evaluateExpression(expressionToEval);
        }
        return evaluate(expressionToEval.toString());
    }

    private int evaluate(String expression) {
        String[] values = expression.trim().split(" ");

        List<String> operators = new ArrayList<String>();
        List<Integer> operands = new ArrayList<Integer>();
        operators.add("+");
        separateOperandsAndOperator(values, operators, operands);
        int result = operate(operators,operands);
        return result;
    }
    private int operate(List<String> operators,List<Integer> operands){
        Operations operationsMap = new Operations();
        int result = 0;

        for (int i = 0; i < operators.size(); i++) {

            String operator = operators.get(i);
            int operand2 = operands.get(i);
            int operand1 = result;

            result = operationsMap.operate(operator, operand1, operand2);
        }
        return result;
    }


    private void separateOperandsAndOperator(String[] values, List<String> operators, List<Integer> operands) {
        for (String value : values) {
            try {
                operands.add(Integer.parseInt(value));
            } catch (Exception ex) {
                operators.add(value);
            }
        }
    }


    private String solveBrackets(String expression) {
        String expressionInBracket, expressionWithoutBrackets;
        int startIndex =0;
        int endIndex =0;
        for (int index = 0; index < expression.length(); index++) {
            if ('(' == expression.charAt(index)) {
                startIndex = index;
            }
            if (')' == expression.charAt(index)) {
                endIndex = index;
                break;
            }
        }
        expressionInBracket = expression.substring(startIndex + 1, endIndex);
        int resultOfBracket = this.evaluate(expressionInBracket);
        expressionWithoutBrackets = expression.replace('(' + expressionInBracket + ')', Integer.toString(resultOfBracket));
        return expressionWithoutBrackets;
    }
}