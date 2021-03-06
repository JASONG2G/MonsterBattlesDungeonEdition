package com.objectivemonsters.consumables;

// consumable items the player may collect and carry and use
public class Items {
    String name;
    // TODO: comment here
    String type;
    // in advanced versions, too much weight will limit amount can carry
    int weight;

    // constructor

    public Items(String name, String type, int weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
    }


    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    //tailored toString

    @Override
    public String toString() {
        return "Items{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", weight=" + weight +
                '}';
    }
}
