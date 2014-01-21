package tanbirka.expressionEvaluator.api;

import java.util.HashMap;
import java.util.Map;

interface Operatable {
    int evaluate(int operand1, int operand2);
}
public class Operations {
    Map<String, Operatable> operators;

    public Operations() {
        operators = new HashMap<String, Operatable>();

        operators.put("+", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 + operand2;
            }
        });
        operators.put("-", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 - operand2;
            }
        });
        operators.put("*", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 * operand2;
            }
        });
        operators.put("/", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return operand1 / operand2;
            }
        });
        operators.put("^", new Operatable() {
            @Override
            public int evaluate(int operand1, int operand2) {
                return (int) Math.pow(operand1, operand2);
            }
        });
    }
    public int operate(String operator, int operand1, int operand2) {
        return operators.get(operator).evaluate(operand1,operand2);
    }
}