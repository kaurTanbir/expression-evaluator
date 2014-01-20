package tanbirka.expressionEvaluator.cli;
import tanbirka.expressionEvaluator.api.Evaluator;

public class EvaluatorMain {
    public static void main(String[] args) {
        Evaluator evaluator = new Evaluator();
        System.out.println(evaluator.getExpression(args[0]));
    }
}
