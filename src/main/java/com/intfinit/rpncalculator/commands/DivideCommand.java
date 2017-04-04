package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.Model;
import com.intfinit.rpncalculator.RPNCalculatorException;

import java.math.BigDecimal;

public class DivideCommand extends DoubleOperandCommand {

    public DivideCommand(Model model) {
        super(model);
    }

    @Override
    protected void doExecute() throws RPNCalculatorException {
        BigDecimal[] currentOperands = getOperands();
        getModel().divide(currentOperands[0], currentOperands[1]);

    }
}
