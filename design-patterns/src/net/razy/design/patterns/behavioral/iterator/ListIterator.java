package net.razy.design.patterns.behavioral.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {

    private final List<T> list;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public T next() {
        return null;
    }

}
