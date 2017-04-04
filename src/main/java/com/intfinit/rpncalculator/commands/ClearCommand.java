package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.Model;
import com.intfinit.rpncalculator.RPNCalculatorException;

public class ClearCommand extends AbstractCommand {

    public ClearCommand(Model model) {
        super(model);
    }

    @Override
    protected void doExecute() {
        getModel().clear();
    }

    public void undo() {
        // does nothing as there are no undo requirements for clear command.
    }

    @Override
    protected void init() throws RPNCalculatorException {
        // Nothing to do
    }
}
