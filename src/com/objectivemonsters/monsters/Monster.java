package com.objectivemonsters.monsters;

public class Monster {
    String name;
    // Health points
    boolean isFriendly;
    int HP;
    // the type called Elemental and an enum
    Elemental elm;
    // strength used in battle engine to determine attack damage to HP
    int strength;
    // intellect used in battle engine to determine avoiding attack
    int intellect;
    // agility used in battle engine to determine chance of striking more than once in an attack
    int agility;
    // add dimension to story with description of monster color, size, scariness all text-based
    String desc;
    // determine if a monster is friend or foe.

    // Constructors

    public Monster(String name, int HP, Elemental elm, int strength, int intellect, int agility, String desc, boolean isFriendly) {
        this.name = name;
        this.HP = HP;
        this.elm = elm;
        this.strength = strength;
        this.intellect = intellect;
        this.agility = agility;
        this.desc = desc;
        this.isFriendly = isFriendly;
    }


    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public Elemental getElm() {
        return elm;
    }

    public void setElm(Elemental elm) {
        this.elm = elm;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntellect() {
        return intellect;
    }

    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    // tailored toString


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", HP=" + HP +
                ", elm=" + elm +
                ", strength=" + strength +
                ", intellect=" + intellect +
                ", agility=" + agility +
                ", desc='" + desc + '\'' +
                ", isFriendly=" + isFriendly +
                '}';
    }
}
