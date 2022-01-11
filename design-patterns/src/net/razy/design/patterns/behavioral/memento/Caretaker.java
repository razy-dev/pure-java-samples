package net.razy.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    List<Memento> history = new ArrayList<>();

    private Originator originator;

    public Caretaker(Originator originator) {
        this.originator = originator;
    }

    public void setState(String state, String option) {
        System.out.println("\nSet Originator State");
        originator.setState(state);
        originator.setOption(option);
        originator.printInfo();
    }

    public void saveState() {
        this.history.add(originator.createMemento());
    }

    public void undo() {
        System.out.println("\nRestore Originator State");
        if (history.size() > 0) {
            originator.restore(history.remove(history.size() - 1));
            originator.printInfo();
        } else {
            System.out.println("\t- Undo History is empty!!");
        }
    }

}
