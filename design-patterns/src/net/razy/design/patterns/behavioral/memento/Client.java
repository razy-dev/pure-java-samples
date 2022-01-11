package net.razy.design.patterns.behavioral.memento;

/**
 * GOF
 * <p>
 * 메멘토 패턴은 객체의 상태 정보를 저장하고 사용자의 필요에 의하여 원하는 시점의 데이터를 복원 할 수 있는 패턴을 의미합니다.
 */
public class Client {

    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker(new Originator());

        caretaker.setState("State 1", "Option 1");
        caretaker.saveState();

        caretaker.setState("State 2", "Option 2");
        caretaker.saveState();

        caretaker.setState("State 3", "Option 3");

        caretaker.undo();
        caretaker.undo();
        caretaker.undo();
    }

}
