package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.Model;
import com.intfinit.rpncalculator.RPNCalculatorException;

import java.math.BigDecimal;

public abstract class AbstractCommand implements Command {

    private Model model;
    private BigDecimal[] operands;

    AbstractCommand(Model aModel) {
        model = aModel;
    }

    protected Model getModel() {
        return model;
    }

    public void execute() throws RPNCalculatorException {
        init();
        doExecute();
    }

    protected abstract void init() throws RPNCalculatorException;

    protected abstract void doExecute() throws RPNCalculatorException;

    BigDecimal[] getOperands() {
        return operands;
    }

    void setOperands(BigDecimal[] operands) {
        this.operands = operands;
    }

}
