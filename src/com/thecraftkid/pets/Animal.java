package com.thecraftkid.pets;

/**
 * Created by willie on 7/23/17.
 */
public class Animal implements Pet {

    private String name = Pet.DEFAULT_NAME;

    private int health = 0;

    private int hunger = 0;

    private int happiness = 0;

    public Animal() {
        // no-op
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public int getHunger() {
        return hunger;
    }

    @Override
    public void eat(Food food) {
        health += food.getHealthValue();
        hunger += food.getFulfillment();
        happiness += food.getHappiness();
    }

    @Override
    public int getHappiness() {
        return happiness;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void kill(DeathReason reason) {
        Game.getInstance().gameOver(reason.toString());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", hunger=" + hunger +
                ", happiness=" + happiness +
                '}';
    }
}
