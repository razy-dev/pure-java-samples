package net.razy.design.patterns.creational.prototype;

/**
 * GOF
 * 생성할 객체들의 타입이 프로토타입인 인스턴스로부터 결정되도록 하며,
 * 인스턴스는 새 객체를 만들기 위해 자신을 `복제(clone)` 한다.
 */
public class Client {

    public static void main(String[] args) {

        // 1000원 짜리 상품 prototype 을 제작 한다.
        AbstractPrototype protoA = new ConcreteProduct1000("Product A");

        // 1000원 짜리 상품 prototype 으로 제품을 생산 한다.
        System.out.println("\nCreate Products Type A");
        AbstractPrototype productA;
        for (int i = 0; i < 3; i++) {
            productA = protoA.clone();
            productA.printInfo();
        }

        // 2000원 짜리 상품 prototype 을 제작 한다.
        AbstractPrototype protoB = new ConcreteProduct2000("Product B");

        // 2000원 짜리 상품 prototype 으로 제품을 생산 한다.
        System.out.println("\nCreate Products Type B");
        AbstractPrototype productB;
        for (int i = 0; i < 3; i++) {
            productB = protoB.clone();
            productB.printInfo();
        }
    }

}
