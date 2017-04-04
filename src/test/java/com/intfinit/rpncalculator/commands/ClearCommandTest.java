package com.intfinit.rpncalculator.commands;

import com.intfinit.rpncalculator.Model;
import com.intfinit.rpncalculator.RPNCalculatorException;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class ClearCommandTest {

    private Model model;

    @Before
    public void setUp() {
        model = new Model();
    }

    @Test(expected = NullPointerException.class)
    public void executeWithNullModel() throws RPNCalculatorException {
        model = null;
        Command cmd = new ClearCommand(model);
        cmd.execute();
    }

    @Test
    public void undoWithNullModel() throws RPNCalculatorException {
        model = null;
        Command cmd = new ClearCommand(model);
        cmd.undo();
        assertThat(model).isNull();
    }

    @Test
    public void executeWithEmptyModel() throws RPNCalculatorException {
        Command cmd = new ClearCommand(model);
        cmd.execute();
        assertThat(model.size()).isEqualTo(0);
    }

    @Test
    public void undoWithEmptyModel() throws RPNCalculatorException {
        Command cmd = new ClearCommand(model);
        cmd.undo();
        assertThat(model.size()).isEqualTo(0);
    }

    @Test
    public void executeSuccess() throws RPNCalculatorException {
        model.push(new BigDecimal(9));
        model.push(new BigDecimal(3));
        Command cmd = new ClearCommand(model);
        cmd.execute();
        assertThat(model.size()).isEqualTo(0);
    }

    @Test
    public void executeAndUndoSuccess() throws RPNCalculatorException {
        model.push(new BigDecimal(9));
        model.push(new BigDecimal(3));
        Command cmd = new ClearCommand(model);
        cmd.execute();
        cmd.undo();
        assertThat(model.size()).isEqualTo(0);
    }
}
