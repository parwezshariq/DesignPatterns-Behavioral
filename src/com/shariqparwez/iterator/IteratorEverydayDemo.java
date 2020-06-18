package com.shariqparwez.iterator;

import java.util.*;

public class IteratorEverydayDemo {
    public static void main(String[] args) {
        // ## 1 - Iterator Pattern - List [S]
        //iteratorEverydayDemoOperationOne();

        // ## 2 - Iterator Pattern - List (For-each)
        //iteratorEverydayDemoOperationTwo();

        // ## 3 - Iterator Pattern - List (For loop traditional)
        //iteratorEverydayDemoOperationThree();

        // ## 4 - Iterator Pattern - Set (Iterator)
        //iteratorEverydayDemoOperationFour();

        // ## 5 - Iterator Pattern - Set (For-each)
        iteratorEverydayDemoOperationFive();

    }

    private static void iteratorEverydayDemoOperationOne() {
        // Create List of string to hold names
        List<String> names = new ArrayList<>();

        // Add names into list
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        // Get iterator from list of names
        Iterator<String> namesIterator = names.iterator();

        // Iterate through iterator
        while (namesIterator.hasNext()) {
            // Read name
            String name = namesIterator.next();

            // Print name
            System.out.println(name);

            // Remove name read from iterator
            namesIterator.remove();
        }

        // Print array list size after reading and removing the names through iterator
        System.out.println("Names size: " + names.size());
    }

    private static void iteratorEverydayDemoOperationTwo() {
        // Create List of string to hold names
        List<String> names = new ArrayList<>();

        // Add names into list
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        // For each uses iterator within to iterate
        for (String name : names) {
            System.out.println(name);
        }

        // Print array list size after reading through for-each loop
        System.out.println("Names size: " + names.size());
    }

    private static void iteratorEverydayDemoOperationThree() {
        // Create List of string to hold names
        List<String> names = new ArrayList<>();

        // Create set of string, commenting above line
        // This will cause line number 78 to have compilation error
        //Set<String> names = new HashSet<>();

        // Add names into list
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        // Traditional for loop, need to maintain index position
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
        }

        // Print array list size after reading through for-each loop
        System.out.println("Names size: " + names.size());
    }

    private static void iteratorEverydayDemoOperationFour() {
        // Create Set of string to hold names
        Set<String> names = new HashSet<>();

        // Add names into list
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        // Get iterator from list of names
        Iterator<String> namesIterator = names.iterator();

        // Iterate through iterator
        while (namesIterator.hasNext()) {
            // Read name
            String name = namesIterator.next();

            // Print name
            System.out.println(name);

            // Remove name read from iterator
            namesIterator.remove();
        }

        // Print set size after reading and removing the names through iterator
        System.out.println("Names size: " + names.size());
    }

    private static void iteratorEverydayDemoOperationFive() {
        // Create Set of string to hold names
        Set<String> names = new HashSet<>();

        // Add names into list
        names.add("Bryan");
        names.add("Aaron");
        names.add("Jason");

        // For each uses iterator within to iterate
        for (String name : names) {
            System.out.println(name);
        }

        // Print set size after reading through for-each loop
        System.out.println("Names size: " + names.size());
    }
}
