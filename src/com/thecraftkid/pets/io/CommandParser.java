package com.thecraftkid.pets.io;

import com.thecraftkid.pets.Game;
import com.thecraftkid.pets.PetStore;

/**
 * Created by willie on 7/23/17.
 */
public class CommandParser {

    public static final String EXIT_COMMAND = "exit";
    public static final String QUIT_COMMAND = "quit";

    /**
     * Example: {@code getPlayer food}
     */
    public static final String COMMAND_GET = "get";

    public static final String COMMAND_NEW = "new";

    public static final String COMMAND_STATUS = "status";

    public static final String COMMAND_ARG_INVENTORY = "inventory";

    public static final String COMMAND_ARG_PET = "pet";

    public static final String COMMAND_ARG_FOOD = "food";

    /**
     * Parses commands
     *
     * @param input A token-separated string of commands
     */
    public static String[] parseInput(String input) {
        return input.split("\\s+");
    }


    public static void handleInput(String input) {
        Printer printer = Printer.getInstance();
        input = input.toLowerCase();
        String[] args = parseInput(input);
        switch (args[0]) {
            case EXIT_COMMAND:
            case QUIT_COMMAND:
                Game.getInstance().quit();
                break;
            case COMMAND_GET:
                if (args.length > 1) {
                    handleGet(args[1]);
                } else {
                    printer.print("\"get\" usage: \"get [thing]\"");
                }
                break;
            case COMMAND_STATUS:
                handleStatus(args[1]);
                break;
            default:
                printer.print("What?");
                break;
        }
    }

    private static void handleStatus(String arg) {
        Printer printer = Printer.getInstance();
        switch (arg) {
            case COMMAND_ARG_INVENTORY:
                // TODO: 7/24/17 Print player status
                break;
            case COMMAND_ARG_PET:
                // TODO: 7/24/17 Print pet status
                break;
        }
    }

    /**
     * @param arg One of {@link #COMMAND_ARG_PET}
     */
    public static void handleGet(String arg) {
        Printer printer = Printer.getInstance();
        switch (arg) {
            case COMMAND_ARG_PET:
                printer.print("Entering pet shop.");
                printer.print("What pet would you like to buy?");
                PetStore.launchBuyFlow(printer);
                break;
            case COMMAND_ARG_FOOD:
                printer.print("What food would you like to buy?");
                printer.print("Choose from this list");
                break;
            default:
                printer.print("\"get\" usage: \"get [thing]\"");
                break;
        }
    }
}
