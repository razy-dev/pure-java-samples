package net.razy.design.patterns.behavioral.strategy;

public class CatBark implements BarkBehavior {

    @Override
    public void bark() {
        System.out.println("냥냥");
    }

}
