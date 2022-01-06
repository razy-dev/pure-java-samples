package net.razy.design.patterns.structural.decorator;

/**
 * GOF
 * 객체에 동적으로 새로운 책임을 추가할 수 있게 합니다. 기능을 추가하려면, 서브클래스를 생성하는 것보다 융통성 있는 방법을 제공합니다.
 * <p>
 * 객체의 타입과 호출 가능한 메소드를 그대로 유지하면서 객체에 새로운 책임을 추가할 때 사용한다.
 * 탈부착 가능한 책임을 정의할 때 사용한다.
 * 상속을 통해 서브클래스를 계속 만드는 방법이 비효율적일 때 사용한다.
 * 특히 조합되는 경우의 수가 많으면 서브클래스 수가 폭발적으로 늘어날 수 있다.
 */
public class Main {

    public static void main(String[] args) {
        Component component = new ConcreteDecoratorB(
                new ConcreteDecoratorA(
                        new ConcreteComponent()
                )
        );
        System.out.println(component.title());
    }

}
