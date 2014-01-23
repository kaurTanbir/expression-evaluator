package tanbirka.expressionEvaluator.api;

import java.util.HashMap;
import java.util.Map;

interface Operatable {
    double evaluate(double operand1, double operand2);
}
public class Operations {
    Map<String, Operatable> operators;

    public Operations() {
        operators = new HashMap<String, Operatable>();

        operators.put("+", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 + operand2;
            }
        });
        operators.put("-", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 - operand2;
            }
        });
        operators.put("*", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 * operand2;
            }
        });
        operators.put("/", new Operatable() {
            @Override
            public double evaluate(double operand1, double operand2) {
                return operand1 / operand2;
            }
        });
        operators.put("^", new Operatable() {
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