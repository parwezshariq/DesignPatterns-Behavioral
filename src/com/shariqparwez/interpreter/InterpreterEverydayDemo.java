package com.shariqparwez.interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {
    public static void main(String[] args) {
        // ## 1 - Interpreter Pattern - Pattern
        interpreterEverydayDemoOperationOne();
    }

    private static void interpreterEverydayDemoOperationOne() {
        // Provide input string to be interpreted
        String input = "Lions, and tigers, and bears! Oh, my!";

        // Pattern through which input string need to be matched
        Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");

        // Matcher reference using input string
        Matcher m = p.matcher(input);

        // Print all matched references found in input string
        while (m.find()) {
            System.out.println("Found a " + m.group() + ".");
        }
    }
}
