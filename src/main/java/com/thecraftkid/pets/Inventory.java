package com.thecraftkid.pets;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by willie on 7/23/17.
 */
public class Inventory {

    private List<Item> mItems = new ArrayList<>();

    public List<Item> getItems() {
        return mItems;
    }

    public List<Food> getFoods() {
        List<Food> foods = new ArrayList<>();
        for (Item item : getItems()) {
            if (item instanceof Food) {
                foods.add((Food) item);
            }
        }
        return foods;
    }

    public interface Item {

        String DEFAULT_NAME = "Cool beans";

        String DEFAULT_DESCRIPTION = "A can of interesting beans";

        String getName();

        default String getDescription() {
            return DEFAULT_DESCRIPTION;
        }

    }

    public interface ConsumableItem extends Item {

        void onConsumption();
    }

    public interface NonConsumableItem extends Item {

        void onUse();
    }
}
