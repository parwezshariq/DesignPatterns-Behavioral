package com.shariqparwez.mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        // ## 1 - Mediator Pattern - Mediator [S]
        // mediatorDemoOperationOne();

        // ## 2 - Mediator Pattern - Mediator [S]
        mediatorDemoOperationTwo();
    }

    private static void mediatorDemoOperationOne() {
        // Get mediator reference
        Mediator mediator = new Mediator();

        // Create bedroomLight, kitchenLight
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        // Register lights with mediator
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        // Build command to turn on lights using mediator
        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        // Execute the command to turn on lights
        turnOnAllLightsCommand.execute();
    }

    private static void mediatorDemoOperationTwo() {
        // Get mediator reference
        Mediator mediator = new Mediator();

        // Create bedroomLight, kitchenLight
        Light bedroomLight = new Light("Bedroom");
        Light kitchenLight = new Light("Kitchen");

        // Register lights with mediator
        mediator.registerLight(bedroomLight);
        mediator.registerLight(kitchenLight);

        // Build command to turn on lights using mediator
        Command turnOnAllLightsCommand = new TurnOnAllLightsCommand(mediator);

        // Execute the command to turn on lights
        turnOnAllLightsCommand.execute();

        // Build command to turn off lights using mediator
        Command turnOffAllLightsCommand = new TurnOffAllLightsCommand(mediator);

        // Execute the command to turn off lights
        turnOffAllLightsCommand.execute();
    }
}
