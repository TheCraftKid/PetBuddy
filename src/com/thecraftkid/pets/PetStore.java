package com.thecraftkid.pets;

import com.thecraftkid.pets.io.Printer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by willie on 7/23/17.
 */
public class PetStore {

    public static PetStore getInstance() {
        return new PetStore();
    }

    public static void launchBuyFlow(Printer printer) {
        PetStore petStore = new PetStore();
    }

    public Pet getPet(Object[] args) {
        // TODO: 7/23/17 Add support for args
        return fetchRandomPet();
    }

    private Pet fetchRandomPet() {
        // TODO: 7/23/17 Get random pet from file
        Pet[] pets = new Pet[]{
                new Animal("Joe"), new Animal("Jeff"), new Animal("Henry")
        };
        return pets[ThreadLocalRandom.current().nextInt(pets.length)];
    }

    public List<Food> getFoods() {
        return Arrays.asList(new Donut(), new Donut());
    }
}
