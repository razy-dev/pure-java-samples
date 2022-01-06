package net.razy.design.patterns.structural.bridge;

public class DogBodyHandler implements IBodyHandler {

    @Override
    public void say(String sound) {
        System.out.println("댕댕이는 " + sound);
    }

    @Override
    public void eat() {
        System.out.println("댕댕이는 초묵초묵");
    }

    @Override
    public void run() {
        System.out.println("댕댕이는 다다다");
    }

}
