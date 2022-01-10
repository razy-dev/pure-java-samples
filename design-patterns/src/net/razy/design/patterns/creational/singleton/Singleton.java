package net.razy.design.patterns.creational.singleton;

import java.util.Optional;

public class Singleton {

    private static Singleton instance;

    private int reference_count = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        instance = Optional.ofNullable(instance).orElse(new Singleton());
        instance.reference_count++;
        return instance;
    }

    public void printInfo() {
        System.out.println("This Class Reference count is " + reference_count);
    }

}
