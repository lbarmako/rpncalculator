package com.intfinit.rpncalculator;

import com.intfinit.rpncalculator.commands.Command;

import java.util.Stack;

public class Controller {

    private Stack<Command> commandHistory;

    Controller() {
        commandHistory = new Stack<>();
    }

    void executeCommand(Command command) throws RPNCalculatorException {
        // Execute the command and add it to the history list
        command.execute();
        commandHistory.add(command);
    }

    public void undo() throws RPNCalculatorException {

        if (commandHistory.size() > 0) {
            // Get the Command object to be undone
            Command command = commandHistory.pop();

            // Execute the Command object's undo method
            command.undo();
        }
    }

    void clearUndoHistory() {
        commandHistory.clear();
    }
}
