package net.razy.design.patterns.creational.singleton;

/**
 * GOF
 * 인스턴스를 하나만 만들어 사용하기 위한 패턴이다.
 * 즉 생성자의 호출이 반복적으로 이뤄져도 실제로 생성되는 객체는 최초 생성된 객체를 반환해주는 것이다.
 */
public class Client {

    public static void main(String[] args) {
        // It's impossible
        // Singleton singleton = new Singleton();

        System.out.println("\nCreate the first instance");
        Singleton singleton = Singleton.getInstance();
        singleton.printInfo();

        System.out.println("\nCreate the second instance");
        Singleton singleton1 = Singleton.getInstance();
        singleton.printInfo();      // 동일한 인스턴스이므로, 출력 값도 동일하다.
        singleton1.printInfo();     // 동일한 인스턴스이므로, 출력 값도 동일하다.

        System.out.println("\nCreate the third instance");
        Singleton singleton2 = Singleton.getInstance();
        singleton.printInfo();      // 동일한 인스턴스이므로, 출력 값도 동일하다.
        singleton1.printInfo();     // 동일한 인스턴스이므로, 출력 값도 동일하다.
        singleton2.printInfo();     // 동일한 인스턴스이므로, 출력 값도 동일하다.

    }

}
