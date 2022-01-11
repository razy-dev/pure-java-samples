package net.razy.design.patterns.structural.flyweight;

/**
 * GOF
 */
public class Client {

    public static void main(String[] args) {

        FlyweightFactory factory = new FlyweightFactory();
        factory.getFlyweight(Flyweight.Weight.FLY).printInfo();
        factory.getFlyweight(Flyweight.Weight.LIGHT).printInfo();
        factory.getFlyweight(Flyweight.Weight.MIDDLE).printInfo();
        factory.getFlyweight(Flyweight.Weight.MIDDLE).printInfo();
        factory.getFlyweight(Flyweight.Weight.HEAVY).printInfo();
        factory.getFlyweight(Flyweight.Weight.LIGHT).printInfo();
        factory.getFlyweight(Flyweight.Weight.FLY).printInfo();
    }

}
