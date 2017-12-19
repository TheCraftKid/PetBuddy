package com.thecraftkid.pets;

/**
 * This class is the template for all pets created
 */
public interface Pet {

    String DEFAULT_NAME = "Daniel";

    int getHealth();

    int getHunger();

    void eat(Food food);

    int getHappiness();

    default String getName() {
        return DEFAULT_NAME;
    }

    void kill(DeathReason reason);

    enum DeathReason {

        HEALTH("Your pet has died from pain."),
        SICKNESS("Your pet has succumbed to the common cold."),
        HUNGER("Your pet has died from malnourishment."),
        HAPPINESS("Your pet has ran away from unhappiness.");

        private final String reason;

        DeathReason(String reason) {
            this.reason = reason;
        }

        @Override
        public String toString() {
            return this.reason;
        }

    }
}

