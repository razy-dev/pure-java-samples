package net.razy.design.patterns.creational.factory_method;

abstract class AbstractProduct {

    public abstract String getTitle();

    public abstract int getPrice();

    public void printInfo() {
        System.out.println("\n Product");
        System.out.println("\t- Title : " + this.getTitle());
        System.out.println("\t- Price : " + this.getPrice());
    }

}
