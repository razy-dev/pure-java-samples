package net.razy.design.patterns.behavioral.iterator;

public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println(name);
    }

}
