package net.razy.design.patterns.creational.abstract_factory;

/**
 * 제품군(재료) 생성을 담당 하는 클래스.
 */
public abstract class AbstractFactory {

    abstract public AbstractProductA createProductA();

    abstract public AbstractProductB createProductB();

}
