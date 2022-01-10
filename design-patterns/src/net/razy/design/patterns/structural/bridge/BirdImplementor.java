package net.razy.design.patterns.structural.bridge;

public class BirdImplementor implements ActionImplementor {

    @Override
    public void move() {
        System.out.println("\t- 조류는 날아간다.");
    }

    @Override
    public void attack() {
        System.out.println("\t- 조류는 낙아챈다.");
    }

}
