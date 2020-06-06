package com.shariqparwez.command;

public class CommandEverydayDemo {
    public static void main(String[] args) {
        // ## 1 - Command pattern - Runnable
        commandEverydayDemoOperationOne();
    }

    private static void commandEverydayDemoOperationOne() {
        // Create two separate runnable tasks, encapsulating request
        Task taskOne = new Task(10, 12);
        Task taskTwo = new Task(11, 13);

        // Create thread with runnable task
        Thread threadOne = new Thread(taskOne);

        // Invoke task
        threadOne.start();

        // Create thread with runnable task
        Thread threadTwo = new Thread(taskTwo);

        // Invoke task
        threadTwo.start();
    }
}
