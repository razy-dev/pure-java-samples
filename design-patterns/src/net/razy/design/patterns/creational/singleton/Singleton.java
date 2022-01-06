package net.razy.design.patterns.creational.singleton;

import java.util.Optional;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance() {
        instance = Optional.ofNullable(instance).orElse(new Singleton());
        return instance;
    }

}
