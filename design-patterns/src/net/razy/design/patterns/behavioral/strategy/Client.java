package net.razy.design.patterns.behavioral.strategy;

/**
 * 동일 계열의 알고리즘을 정의하고 상호교환이 가능하게 한다
 * <p>
 * GOF
 * 동일 계열의 알고리즘군을 정의하고, 각 알고리즘을 캡슐화하며, 이들을 상호교환이 가능하도록 만듭니다.
 * 알고리즘을 사용하는 클라이언트와 상관없이 독립적으로 알고리즘을 다양하게 변경할 수 있게 합니다.
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new NormalDiscountStrategy());
        context.calculate(500, 10);
        context.calculate(100, 10);

        context.setStrategy(new WeekendDiscountStrategy());
        context.calculate(500, 10);
        context.calculate(100, 10);
    }

}
