package com.objectivemonsters.dungeon;

import com.objectivemonsters.consumables.Items;
import com.objectivemonsters.monsters.Monster;

import java.util.List;

// the dungeon containing all game items and objects
public class Dungeon {

    // collection of rooms in this level of dungeon
    List<Room> dungeonRooms;
    // collection of monsters in this level of dungeon
    List<Monster> dungeonMonsters;
    // items available in this level of dungeon
    List<Items> dungeonItems;
    // when escape is true, generate new dungeon level, this is true when player uses shard created key to open door
    Boolean escape;
    // Dungeon level for advanced dungeons
    int level;


    // TODO: no-arg or tailored constructors

    // Getters and  Setters

    public List<Room> getDungeonRooms() {
        return dungeonRooms;
    }

    public void setDungeonRooms(List<Room> dungeonRooms) {
        this.dungeonRooms = dungeonRooms;
    }

    public List<Monster> getDungeonMonsters() {
        return dungeonMonsters;
    }

    public void setDungeonMonsters(List<Monster> dungeonMonsters) {
        this.dungeonMonsters = dungeonMonsters;
    }

    public List<Items> getDungeonItems() {
        return dungeonItems;
    }

    public void setDungeonItems(List<Items> dungeonItems) {
        this.dungeonItems = dungeonItems;
    }

    public Boolean getEscape() {
        return escape;
    }

    public void setEscape(Boolean escape) {
        this.escape = escape;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    // TODO: tailored toString

}
