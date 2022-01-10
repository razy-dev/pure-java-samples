package net.razy.design.patterns.creational.prototype;

public abstract class AbstractPrototype implements Cloneable {

    protected String title;

    protected int price;

    public AbstractPrototype(String title) {
        this.title = title;
    }

    @Override
    public AbstractPrototype clone() {
        AbstractPrototype copy = null;
        try {
            copy = (AbstractPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return copy;
    }

    public void printInfo() {
        System.out.println("\n Product");
        System.out.println("\t- Title : " + this.title);
        System.out.println("\t- Price : " + this.price);
    }

}
