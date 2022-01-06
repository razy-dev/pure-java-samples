package net.razy.design.patterns.behavioral.strategy;

public class DocBark implements BarkBehavior {

    @Override
    public void bark() {
        System.out.println("댕댕");
    }

}
