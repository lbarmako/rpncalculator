package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.Model;
import com.intfinit.rpncalculator.RPNCalculatorException;

import java.math.BigDecimal;

public class SubtractCommand extends DoubleOperandCommand {

    public SubtractCommand(Model model) {
        super(model);
    }

    @Override
    protected void doExecute() throws RPNCalculatorException {
        BigDecimal[] currentOperands = getOperands();
        getModel().subtract(currentOperands[0], currentOperands[1]);

    }
}
