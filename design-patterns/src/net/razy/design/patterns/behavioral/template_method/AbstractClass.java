package net.razy.design.patterns.behavioral.template_method;

public abstract class AbstractClass {

    // Template Method : 알고리즘의 구조 정의
    public final void run() {
        System.out.println("\nExecute Run Method on " + this.getClass().getSimpleName());
        ready();
        send();
        close();
    }

    // Hook Method: 개별 알고리즘
    void ready() {
        System.out.println("\t- Ready!!");
    }

    // Hook Method: 개별 알고리즘
    abstract void send();

    // Hook Method: 개별 알고리즘
    void close() {
        System.out.println("\t- Closed!!");
    }

}
