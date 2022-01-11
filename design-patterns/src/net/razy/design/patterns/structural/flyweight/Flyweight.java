package net.razy.design.patterns.structural.flyweight;

interface Flyweight {

    void printInfo();

    enum Weight {
        FLY, LIGHT, MIDDLE, HEAVY
    }

}
