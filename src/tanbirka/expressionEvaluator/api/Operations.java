package tanbirka.expressionEvaluator.api;

import java.util.HashMap;
import java.util.Map;


public class Operations {
    Map<String, Operator> operators;

    public Operations() {
        operators = new HashMap<String, Operator>();

        operators.put("+", new Operator() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 + operand2;
            }
        });
        operators.put("-", new Operator() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 - operand2;
            }
        });
        operators.put("*", new Operator() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 * operand2;
            }
        });
        operators.put("/", new Operator() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 / operand2;
            }
        });
        operators.put("^", new Operator() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return (double) Math.pow(operand1, operand2);
            }
        });
    }
    public double operate(String operator, double operand1, double operand2) {
        return operators.get(operator).evaluate(operand1,operand2);
    }
}