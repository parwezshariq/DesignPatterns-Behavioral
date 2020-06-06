package com.shariqparwez.chainofresponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // ## 1 - Chain of responsibility pattern - Approver [S]
        chainOfResponsibilityDemoOperationOne();
    }

    private static void chainOfResponsibilityDemoOperationOne() {
        // Setup director, vp, ceo (different types of handler)
        Director director = new Director();
        VP vp = new VP();
        CEO ceo = new CEO();

        // Set hierarchy, director -> vp -> ceo
        director.setSuccessor(vp);
        vp.setSuccessor(ceo);

        // Build request of type Conference
        Request request = new Request(RequestType.CONFERENCE, 500);

        // Initiate request handling from top level
        director.handleRequest(request);

        // Build request of type Purchase
        request = new Request(RequestType.PURCHASE, 1000);

        // Initiate request handling from top level
        director.handleRequest(request);

        // Build request of type Purchase
        request = new Request(RequestType.PURCHASE, 2000);

        // Initiate request handling from top level
        director.handleRequest(request);
    }
}
