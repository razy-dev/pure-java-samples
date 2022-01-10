package net.razy.design.patterns.creational.factory_method;

/**
 * GOF
 * 객체를 생성하기 위해 인터페이스를 정의하지만, 어떤 클래스의 인스턴스를 생성할지에 대한 결정은 서브클래스가 내리도록 합니다.
 */
public class Client {

    public static void main(String[] args) {

        // instantiate a creator class
        AbstractCreator creator = new ConcreteCreator();

        // create the product by type None
        AbstractProduct product = creator.factoryMethod("None");
        product.printInfo();

        // create the product by type A
        AbstractProduct productA = creator.factoryMethod("A");
        productA.printInfo();

        // create the product by type B
        AbstractProduct productB = creator.factoryMethod("B");
        productB.printInfo();
    }

}
