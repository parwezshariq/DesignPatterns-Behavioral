package com.shariqparwez.chainofresponsibility;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {

    // Initialize logger
    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

    public static void main(String[] args) {

        // ## 1 - Chain of responsibility pattern - Logging [S]
        chainOfResponsibilityEverydayDemoOperationOne();

    }

    private static void chainOfResponsibilityEverydayDemoOperationOne() {
        // Set logging level
        logger.setLevel(Level.FINER);

        // Initialize consoleHandler
        ConsoleHandler consoleHandler = new ConsoleHandler();

        // Set FINER level in console handler
        consoleHandler.setLevel(Level.FINER);

        // Add consoleHandler in logger
        logger.addHandler(consoleHandler);

        // Add different messages at different logging level [FINEST should not print]
        logger.finest("Finest level of logging");
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");

    }
}
