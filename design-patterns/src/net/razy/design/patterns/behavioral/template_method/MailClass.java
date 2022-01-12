package net.razy.design.patterns.behavioral.template_method;

public class MailClass extends AbstractClass {

    @Override
    void send() {
        System.out.println("\t- Send Mail");
    }

}
