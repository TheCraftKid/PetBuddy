package com.thecraftkid.pets;

/**
 * Created by willie on 7/23/17.
 */
public interface Food {

    /**
     * The default description for all foods that don't implement {@link #getDescription()}
     */
    String DEFAULT_DESCRIPTION = "Just another food.";

    /**
     * @return The name of this food item.
     */
    String getName();

    /**
     * @return A witty user-readable description. Defaults to {@link #DEFAULT_DESCRIPTION}
     */
    default String getDescription() {
        return DEFAULT_DESCRIPTION;
    }

    /**
     * @return The amount of hunger this food removes. Corresponds to {@link Pet#getHunger()}
     */
    int getFulfillment();

    /**
     * @return The amount of happiness this food provides. Corresponds to {@link Pet#getHappiness()}
     */
    int getHappiness();

    /**
     * @return The amount of HP this food replenishes. Corresponds to {@link Pet#getHealth()}
     */
    default int getHealthValue() {
        return getFulfillment();
    }
}
