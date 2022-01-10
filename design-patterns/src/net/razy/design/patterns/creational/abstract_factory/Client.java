package net.razy.design.patterns.creational.abstract_factory;

/**
 * GOF
 * 상세화된 서브클래스를 정의하지 않고도 서로 관련성이 있거나 독립적인 여러 '객체의 군'을 생성하기 위한 인터페이스를 제공합니다.
 */
public class Client {

    public static void main(String[] args) {

        // 1 번 팩토리로 상품 생산
        ProductMaker maker01 = new ProductMaker(new ConcreteFactory01());
        maker01.make();

        // 2 번 팩토리로 상품 생산
        ProductMaker maker02 = new ProductMaker(new ConcreteFactory02());
        maker02.make();
    }

    public static class ProductMaker {

        private AbstractFactory factory;

        public ProductMaker(AbstractFactory factory) {
            this.factory = factory;
        }

        public void make() {
            System.out.println("\nA Completed product made in the " + this.factory.getClass().getSimpleName());
            this.factory.createProductA();
            this.factory.createProductB();
        }

    }

}
