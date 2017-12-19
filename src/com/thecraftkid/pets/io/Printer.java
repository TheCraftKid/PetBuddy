package com.thecraftkid.pets.io;

import com.thecraftkid.pets.Food;
import com.thecraftkid.pets.Inventory;
import com.thecraftkid.pets.Player;

/**
 * Created by willie on 7/23/17.
 */
public class Printer {
    private static Printer sInstance = new Printer();

    public static Printer getInstance() {
        return sInstance;
    }

    private Printer() {
    }

    public void print(String text) {
        System.out.println(text);
    }

    public void printFoods(Player player) {
        for (Food food : player.getInventory().getFoods()) {
            print(food.getName());
        }
    }

    public void printItems(Player player) {
        for (Inventory.Item item : player.getInventory().getItems()) {
            print(item.getName());
        }
    }

}
