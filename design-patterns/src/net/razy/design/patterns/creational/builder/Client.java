package net.razy.design.patterns.creational.builder;

/**
 * GOF
 * 객체의 생성 알고리즘과 조립 방법을 분리하는 것이 목적이다.
 * 복잡한 객체를 생성하는 방법과 표현하는 방법을 정의하는 클래스를 별도로 분리하여 서로 다른 표현이라도 이를 생성할 수 있는 동일한 구축 공정을 제공할 수 있도록 한다.
 */
public class Client {

    public static void main(String[] args) {

        // --------------------------------------------------------------------
        // Using Method Chaining Pattern Builder
        // --------------------------------------------------------------------
        Product product = new ProductBuilder()
                .title("Sample Product")
                .color("BLACK")
                .price(1500)
                .build();
        product.printInfo(ProductBuilder.class.getSimpleName());


        // --------------------------------------------------------------------
        // Using Setter Builder with Director
        // --------------------------------------------------------------------
        Director director = new Director();

        // Set BlueProductBuilder
        director.setBuilder(new BlueProductBuilder());
        director.constructProduct();
        Product blueProduct = director.getProduct();
        blueProduct.printInfo(BlueProductBuilder.class.getSimpleName());

        // Set GreenProductBuilder
        director.setBuilder(new GreenProductBuilder());
        director.constructProduct();
        Product greenProduct = director.getProduct();
        greenProduct.printInfo(GreenProductBuilder.class.getSimpleName());

    }

}
