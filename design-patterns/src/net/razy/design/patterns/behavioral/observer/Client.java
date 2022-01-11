package net.razy.design.patterns.behavioral.observer;

/**
 * GOF
 * 객체 사이에 일 대 다의 의존 관계를 정의해 두어, 어떤 객체의 상태가 변할 때 그 객체에 의존성을 가진 다른 객체들이 그 변화를 통지받고 자동으로 갱신될 수 있게 만듭니다.
 */
public class Client {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserverA());
        subject.attach(new ConcreteObserverB());
        subject.attach(new ConcreteObserverC());

        subject.setState("State 1");
        subject.setState("State 2");
        subject.setState("State 3");
    }

}
