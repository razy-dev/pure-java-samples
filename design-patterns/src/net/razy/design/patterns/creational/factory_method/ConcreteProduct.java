package net.razy.design.patterns.creational.factory_method;

public class ConcreteProduct extends AbstractProduct {

    private String title = "Default Product";

    private int price = 1000;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
