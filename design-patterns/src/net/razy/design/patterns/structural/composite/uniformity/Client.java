package net.razy.design.patterns.structural.composite.uniformity;

/**
 * GOF
 * 객체를 component와 composite로 구성하여 트리 구조로 구성하여 표현하는 전체-부분 패턴으로,
 * 사용자가 단일 객체와 복합 객체 모두 동일하게 다루도록 한다.
 * Directory-File 이 대표적인 예이다.
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite("ROOT");
        Composite sub1 = new Composite("Sub 1");
        Composite sub2 = new Composite("Sub 2");
        Composite sub_sub1 = new Composite("Sub-Sub 1");
        Composite sub_sub2 = new Composite("Sub-Sub 2");
        Leaf leaf1 = new Leaf("Leaf 1");
        Leaf leaf2 = new Leaf("Leaf 2");
        Leaf leaf3 = new Leaf("Leaf 3");

        root.add(sub1);
        root.add(sub2);

        sub1.add(sub_sub1);
        sub2.add(sub_sub2);

        sub_sub1.add(leaf1);
        sub_sub1.add(leaf2);

        sub_sub2.add(leaf1);
        sub_sub2.add(leaf2);

        root.printChildren("");

    }

}
