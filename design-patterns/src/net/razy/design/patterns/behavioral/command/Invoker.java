package net.razy.design.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

    Map<String, Command> commands = new HashMap<>();

    public void registerCommand(String key, Command command) {
        this.commands.put(key, command);
    }

    public void execute(String action) {
        if (this.commands.containsKey(action)) {
            System.out.println("\nInvoker Do Something and Execute command");
            this.commands.get(action).execute();
        }
    }

}
