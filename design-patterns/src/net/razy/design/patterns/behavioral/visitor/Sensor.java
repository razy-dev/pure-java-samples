package net.razy.design.patterns.behavioral.visitor;

public class Sensor implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
