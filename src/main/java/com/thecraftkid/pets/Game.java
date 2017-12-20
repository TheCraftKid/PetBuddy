package com.thecraftkid.pets;

import com.thecraftkid.pets.io.CommandParser;
import com.thecraftkid.pets.io.Printer;

import java.util.Scanner;

/**
 * This Game class simulates the pet by printing out behaviors
 * and states of the pet the user owns.
 */
public final class Game {

    private static Game sInstance = new Game();

    private Printer out = Printer.getInstance();

    public static Game getInstance() {
        return sInstance;
    }

    private Game() {
        // no-op
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        Game game = Game.getInstance();
        game.out.print("Starting game...");
        game.loop(game);
    }

    /**
     * Scans for user input and passes it to the parser for game action
     */
    private void loop(Game game) {
        Player player = Player.fetchFromStorage();
        game.out.print("Enter a command:");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            CommandParser.handleInput(line);
        }
    }

    /**
     * {@link #quit(String)} that outputs a default message
     *
     * @see #quit(String)
     */
    public void quit() {
        quit("Thanks for playing!");
    }

    /**
     * Ends the game loop
     * <p>This is the normal method of quitting the game, i.e., not a "Game over"</p>
     *
     * @param message A final message to output to the user before the game quits
     */
    private void quit(String message) {
        out.print(message);
        System.exit(0);
    }

    /**
     * Sends a "Game over" prompt to the user
     * <p>Must always be last line in method</p>
     *
     * @param message A "Game over" type message to display
     */
    public void gameOver(String message) {
        // TODO: 7/24/17 Add option to wipe save file
        out.print(message);
        System.exit(0);
    }
}
