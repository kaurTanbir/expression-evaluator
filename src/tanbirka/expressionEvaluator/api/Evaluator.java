package tanbirka.expressionEvaluator.api;

import java.util.ArrayList;
import java.util.List;

public class Evaluator {
    public int evaluateExpression(String expression) {

        String[] values = expression.split(" ");
        List<String> operators = new ArrayList<String>();
        List<Integer> operands = new ArrayList<Integer>();

        operators.add("+");
        getOperandsAndOperator(values, operators, operands);

        Operations operationsMap = new Operations();
        int result = 0;

        for (int i = 0; i < operators.size(); i++) {

            String operator = operators.get(i);
            int operand2 = operands.get(i);
            int operand1 = result;

            result = operationsMap.operate(operator, operand1, operand2);
        }
        return  result;
    }
    private void getOperandsAndOperator(String[] values, List<String> operators, List<Integer> operands) {
        for (String value : values) {
            try {
                operands.add(Integer.parseInt(value));
            } catch (Exception ex) {
                operators.add(value);
            }
        }
    }

}





