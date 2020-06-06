package com.shariqparwez.command;

public class Task implements Runnable {
    int numOne;
    int numTwo;

    public Task(int numOne, int numTwo) {
        this.numOne = numOne;
        this.numTwo = numTwo;
    }

    @Override
    public void run() {
        System.out.println(numOne * numTwo);
    }
}
