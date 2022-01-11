package net.razy.design.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<String, Flyweight> flyweightCollection = new HashMap<>();

    public Flyweight getFlyweight(Flyweight.Weight weight) {
        if (!flyweightCollection.containsKey(weight.name())) {
            flyweightCollection.put(weight.name(), new ConcreteFlyweight(weight.name()));
        }
        return flyweightCollection.get(weight.name());
    }

}
