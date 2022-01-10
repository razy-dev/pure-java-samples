package net.razy.design.patterns.creational.builder;

public class Product {

    private String title;

    private String color;

    private int price;

    public Product() {
    }

    public Product(String title, String color, int price) {
        this.title = title;
        this.color = color;
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void printInfo(String productName) {
        System.out.println("\nMade in " + productName);
        System.out.println("\t- Title : " + this.title);
        System.out.println("\t- Color : " + this.color);
        System.out.println("\t- Price : " + this.price);
    }

}
