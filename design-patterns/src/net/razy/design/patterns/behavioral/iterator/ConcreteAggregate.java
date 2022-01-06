package net.razy.design.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

    List<Item> list = new ArrayList<>();

    @Override
    public Iterator iterator() {
        return new ListIterator<Item>(this.list);
    }

    public void add(Item item) {
        list.add(item);
    }

}
