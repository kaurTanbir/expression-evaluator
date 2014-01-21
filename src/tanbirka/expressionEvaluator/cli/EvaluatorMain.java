package tanbirka.expressionEvaluator.cli;
import tanbirka.expressionEvaluator.api.Evaluator;

import java.util.Date;

public class EvaluatorMain {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        System.out.println(evaluator.evaluateExpression(args[0]));
    }
}
