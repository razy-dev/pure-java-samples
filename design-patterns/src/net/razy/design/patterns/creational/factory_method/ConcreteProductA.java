package net.razy.design.patterns.creational.factory_method;

public class ConcreteProductA extends AbstractProduct {

    private String title = "Type A Product";

    private int price = 1100;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
