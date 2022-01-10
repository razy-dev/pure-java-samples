package net.razy.design.patterns.structural.adapter;

public class AdapterA implements Target {

    private final AdapteeA adaptee;

    public AdapterA(AdapteeA adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String request() {
        return adaptee.specificRequest();
    }

}
