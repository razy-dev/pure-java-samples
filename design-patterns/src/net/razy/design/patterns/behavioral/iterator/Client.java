package net.razy.design.patterns.behavioral.iterator;

/**
 * GOF
 * 접근기능과 자료구조를 분리시켜서 객체화합니다. 서로 다른 구조를 가지고 있는 저장 객체에 대해서 접근하기 위해서 interface를 통일.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.add(new Item("item 1"));
        aggregate.add(new Item("item 2"));
        aggregate.add(new Item("item 3"));

        Iterator<Item> it = aggregate.iterator();
        while (it.hasNext()) {
            it.next().printInfo();
        }
    }

}
