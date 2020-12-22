package ru.job4j.tracker;

import java.util.Objects;

public class Item implements Comparable<Item> {
    private int id;
    private String name;

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public Item() {
    }
    public Item(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Item {" +
                " id = " + id +
                ", name = " + name +
                 " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}