package net.razy.design.patterns.structural.adapter;

public class AdapterB implements Target {

    private final AdapteeB adaptee;

    public AdapterB(AdapteeB adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return adaptee.otherRequest();
    }

}
