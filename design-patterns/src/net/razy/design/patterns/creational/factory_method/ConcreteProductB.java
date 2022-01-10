package net.razy.design.patterns.creational.factory_method;

public class ConcreteProductB extends AbstractProduct {

    private String title = "Type B Product";

    private int price = 1500;

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

}
