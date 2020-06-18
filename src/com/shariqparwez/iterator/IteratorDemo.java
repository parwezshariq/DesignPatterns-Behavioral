package com.shariqparwez.iterator;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // ## 1 - Iterator Pattern - Iterator [S]
        //iteratorDemoOperationOne();

        // ## 2 - Iterator Pattern - Iterator (For each)
        iteratorDemoOperationTwo();
    }

    private static void iteratorDemoOperationOne() {
        // Get instance of bikeRepository
        BikeRepository bikeRepository = new BikeRepository();

        // Add bikes into repository
        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        // Get Iterator
        Iterator<String> bikeIterator = bikeRepository.iterator();

        // Iterate through iterator
        while (bikeIterator.hasNext()) {
            System.out.println(bikeIterator.next());
        }
    }

    private static void iteratorDemoOperationTwo() {
        // Get instance of bikeRepository
        BikeRepository bikeRepository = new BikeRepository();

        // Add bikes into repository
        bikeRepository.addBike("Cervelo");
        bikeRepository.addBike("Scott");
        bikeRepository.addBike("Fuji");

        // Iterate through forEach loop
        for (String bike : bikeRepository) {
            System.out.println(bike);
        }
    }
}
