package com.shariqparwez.interpreter;

public class InterpreterDemo {
    static Expression buildSimpleInterpreterTree() {
        // Create terminalExpression object
        Expression terminalExpression = new TerminalExpression("Lions");
        return terminalExpression;
    }

    static Expression buildInterpreterTree() {
        // Create terminalExpression objects
        Expression terminalExpressionOne = new TerminalExpression("Lions");
        Expression terminalExpressionTwo = new TerminalExpression("Tigers");
        Expression terminalExpressionThree = new TerminalExpression("Bears");

        // Expression - Tigers AND Bears
        Expression alternationExpressionOne = new AndExpression(terminalExpressionTwo, terminalExpressionThree);

        // Expression - Lions OR (Tigers AND Bears)
        Expression alternationExpressionTwo = new OrExpression(terminalExpressionOne, alternationExpressionOne);

        // Expression - Bears AND Lions OR (Tigers AND Bears)
        return new AndExpression(terminalExpressionThree, alternationExpressionTwo);
    }

    public static void main(String[] args) {
        // ## 1 - Interpreter Pattern - Interpreter [S]
        //interpreterDemoOperationOne();

        // ## 2 - Interpreter Pattern - Interpreter
        //interpreterDemoOperationTwo();

        // ## 3 - Interpreter Pattern - Interpreter
        //interpreterDemoOperationThree();

        // ## 4 - Interpreter Pattern - Interpreter
        //interpreterDemoOperationFour();

        // ## 5 - Interpreter Pattern - Interpreter
        //interpreterDemoOperationFive();

        // ## 6 - Interpreter Pattern - Interpreter
        interpreterDemoOperationSix();
    }

    private static void interpreterDemoOperationOne() {
        // Define context
        String context = "Lions";

        // Build interpreter tree
        Expression expression = buildSimpleInterpreterTree();

        // Match the expression with the context
        System.out.println(context + " is " + expression.interpret(context));
    }

    private static void interpreterDemoOperationTwo() {
        // Define context
        String context = "Tigers";

        // Build interpreter tree
        Expression expression = buildSimpleInterpreterTree();

        // Match the expression with the context
        System.out.println(context + " is " + expression.interpret(context));
    }

    private static void interpreterDemoOperationThree() {
        // Define context
        String context = "Tigers";

        // Build interpreter tree
        Expression expression = buildInterpreterTree();

        // Match the expression with the context
        System.out.println(context + " is " + expression.interpret(context));
    }

    private static void interpreterDemoOperationFour() {
        // Define context
        String context = "Lions Tigers";

        // Build interpreter tree
        Expression expression = buildInterpreterTree();

        // Match the expression with the context
        System.out.println(context + " is " + expression.interpret(context));
    }

    private static void interpreterDemoOperationFive() {
        // Define context
        String context = "Lions Bears";

        // Build interpreter tree
        Expression expression = buildInterpreterTree();

        // Match the expression with the context
        System.out.println(context + " is " + expression.interpret(context));
    }

    private static void interpreterDemoOperationSix() {
        // Define context
        String context = "Tigers Bears";

        // Build interpreter tree
        Expression expression = buildInterpreterTree();

        // Match the expression with the context
        System.out.println(context + " is " + expression.interpret(context));
    }
}
