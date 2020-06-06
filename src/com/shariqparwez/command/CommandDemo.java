package com.shariqparwez.command;

import java.util.ArrayList;
import java.util.List;

public class CommandDemo {
    public static void main(String[] args) {
        // ## 1 - Command pattern - Switch [S]
        //commandDemoOperationOne();

        // ## 2 - Command pattern - State [S]
        //commandDemoOperationTwo();

        // ## 3 - Command pattern - Macro [S]
        commandDemoOperationThree();
    }

    private static void commandDemoOperationOne() {
        // Initialize light object [Receiver]
        Light light = new Light();

        // Initialize switch object [Invoker]
        Switch lightSwitch = new Switch();

        // Create command object [Command]
        Command onCommand = new OnCommand(light);

        // Invoke command through invoker
        lightSwitch.storeAndExecute(onCommand);
    }

    private static void commandDemoOperationTwo() {
        // Initialize light object [Receiver]
        Light light = new Light();

        // Initialize switch object [Invoker]
        Switch lightSwitch = new Switch();

        // Create command object [Command]
        Command toggleCommand = new ToggleCommand(light);

        // Invoke command through invoker
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
        lightSwitch.storeAndExecute(toggleCommand);
    }

    private static void commandDemoOperationThree() {
        // Initialize light object [Receiver]
        Light bedroomLight = new Light();
        Light kitchenLight = new Light();

        // Initialize switch object [Invoker]
        Switch lightSwitch = new Switch();

        // Create a list of lights
        List<Light> lights = new ArrayList<>();
        lights.add(kitchenLight);
        lights.add(bedroomLight);

        // Initialize allLightsCommand to switch off all lights
        Command allLightsCommand = new AllLightsCommand(lights);

        // Use invoker to execute allLightsCommand
        lightSwitch.storeAndExecute(allLightsCommand);
    }
}
