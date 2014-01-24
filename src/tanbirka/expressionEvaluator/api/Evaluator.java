package tanbirka.expressionEvaluator.api;

import java.util.ArrayList;
import java.util.List;

public class Evaluator {

    public double evaluateExpression(String expression) {
        String expressionToEval = parseInput(expression);
        if (expression.contains("(")){
            expressionToEval = solveBrackets(expressionToEval);
            return evaluateExpression(expressionToEval);
        }
        return evaluate(expressionToEval.toString());
    }

    private double evaluate(String expression) {
        String[] values = expression.trim().split(" ");

        List<String> operators = new ArrayList<String>();
        List<Double> operands = new ArrayList<Double>();
        operators.add("+");
        separateOperandsAndOperator(values, operators, operands);
        Double result = operate(operators,operands);
        return result;
    }
    private double operate(List<String> operators,List<Double> operands){
        Operations operationsMap = new Operations();
        double result = 0;
        for (int i = 0; i < operators.size(); i++) {

            String operator = operators.get(i);
            double operand2 = operands.get(i);
            double operand1 = result;

            result = operationsMap.operate(operator, operand1, operand2);
        }
        return result;
    }


    private void separateOperandsAndOperator(String[] values, List<String> operators, List<Double> operands) {

        for (String value : values) {
            try {
                operands.add(Double.parseDouble(value));
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
        double resultOfBracket = evaluate(expressionInBracket);
        expressionWithoutBrackets = expression.replace('(' + expressionInBracket + ')', Double.toString(resultOfBracket));
        return expressionWithoutBrackets;
    }

    private String parseInput(String expression) {
        expression = expression.replaceAll(" +", "");
        return expression.replaceAll("\\+", " + ")
                .replaceAll("\\-", " - ")
                .replaceAll("\\*", " * ")
                .replaceAll("/", " / ")
                .replaceAll("\\^", " ^ ")
                .replaceAll("\\(", "( ")
                .replaceAll("\\)", " )")
                .replaceAll("  - ", " -")
                .replaceFirst("^ - ", "-");
    }

}