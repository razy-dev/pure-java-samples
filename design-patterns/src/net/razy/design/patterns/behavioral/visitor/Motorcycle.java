package net.razy.design.patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Motorcycle implements Element {

    List<Element> elements = new ArrayList<>();

    public Motorcycle() {
        elements.add(new Sensor());
        elements.add(new Wheel());
        elements.add(new Engine());
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("\n" + visitor.getClass().getSimpleName());
        for (Element e : elements) {
            e.accept(visitor);
        }
    }

}
