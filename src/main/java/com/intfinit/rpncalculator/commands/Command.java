package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.RPNCalculatorException;

public interface Command {

    /**
     * Executes command.
     *
     * @throws RPNCalculatorException - if there is a problem executing command
     */
    void execute() throws RPNCalculatorException;

    /**
     * Undoes the effect of latest command execution.
     *
     * @throws RPNCalculatorException - if there is a problem undoing command
     */
    void undo() throws RPNCalculatorException;
}
