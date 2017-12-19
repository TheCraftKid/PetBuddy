package com.thecraftkid.pets;

import com.thecraftkid.pets.io.StorageManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willie on 7/23/17.
 */
public class Player {

    private List<Pet> mPets = new ArrayList<>();

    /**
     * This game's currency is the "petton," used for buying food.
     */
    private double mMoney = 0.0;

    private Inventory mInventory = new Inventory();

    public List<Pet> getPets() {
        return mPets;
    }

    public double getMoney() {
        return mMoney;
    }

    public Inventory getInventory() {
        return mInventory;
    }

    public static Player fetchFromStorage() {
        StorageManager storage = StorageManager.getInstance();

        return null;
    }

    private static Player fromString(String sting) {
        return null;
    }
}
