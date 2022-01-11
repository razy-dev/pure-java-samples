package net.razy.design.patterns.behavioral.iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T> {

    private final List<T> list;

    private int idx = 0;

    public ListIterator(List<T> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return list != null && list.size() > idx;
    }

    @Override
    public T next() {
        return (T) list.get(idx++);
    }

}
