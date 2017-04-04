package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.Model;

abstract class SingleOperandCommand extends MathOperationCommand {

    private static final int NUMBER_OF_OPERANDS = 1;

    SingleOperandCommand(Model model) {
        super(model, NUMBER_OF_OPERANDS);
    }
}
