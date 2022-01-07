package net.razy.design.patterns.structural.bridge;

/**
 * GOF
 * 구현분에서 추상층을 분리하여 각자 독립적으로 변형이 가능하고 확장이 가능하도록 한다.
 * 즉 기능 클래스 계층과 구현 클래스 계층으로 구현을 하는 패턴.
 * 전형적인 상속을 이용한 패턴으로 확장 설계에 용이.
 */
public class Main {

    public static void main(String[] args) {
        AbstractAbstraction cat = new PetAbstraction(new CatImplementor());
        cat.say();
        cat.eat();
        cat.run();

        AbstractAbstraction dog = new PetAbstraction(new DogImplementor());
        dog.say();
        dog.eat();
        dog.run();
    }

}
