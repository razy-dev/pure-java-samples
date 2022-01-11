package net.razy.design.patterns.structural.flyweight;

public class ConcreteFlyweight implements Flyweight {

    private String name;

    public ConcreteFlyweight(String name) {
        System.out.println("Create New " + name + " weight");
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("\t- Im a " + name + " weight");
    }

}
