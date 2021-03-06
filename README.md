Programming Exercise – RPN Calculator
================================
Some of the best calculators in the world have an 'RPN' (reverse polish notation) mode.
We would like you to write a command-line based RPN calculator.

# Requirements

The calculator has a stack that can contain real numbers.
- The calculator waits for user input and expects to receive strings containing whitespace separated lists of numbers 
and operators.
- Numbers are pushed on to the stack. Operators operate on numbers that are on the stack.
- Available operators are `+, -, *, /, sqrt, undo, clear`
- Operators pop their parameters off the stack, and push their results back onto the stack.
- The `'clear'` operator removes all items from the stack.
- The `'undo'` operator undoes the previous operation. "undo undo" will undo the previous two operations.
- `sqrt` performs a square root on the top item from the stack
- The `'+', '-', '*', '/'` operators perform addition, subtraction, multiplication and division respectively on the top 
two items from the stack.
- After processing an input string, the calculator displays the current contents of the stack as a space-separated list.
- Numbers should be stored on the stack to at least `15` decimal places of precision, but displayed to `10` decimal 
places (or less if it causes no loss of precision).
- All numbers should be formatted as plain decimal strings (ie. no engineering formatting).
- If an operator cannot find a sufficient number of parameters on the stack, a warning is displayed:
`operator <operator> (position: <pos>): insufficient parameters`

- After displaying the warning, all further processing of the string terminates and the current state of the stack is 
displayed.

# Sample Example Corrections
- **Example 4** has incorrect answer as per requirements below. `undo` undoes the previous operation, 
thus the final answer to that example should be `stack: 20 5`.
See _com.intfinit.rpncalculator.RPNCalculatorTest.sampleTest4_
- Example 7 has incorrect answer as per requirements below.
The final answer to that example should be `stack: 120`
See _com.intfinit.rpncalculator.RPNCalculatorTest.sampleTest7_


# Deliverables
- The solution submitted should include structure, source code, configuration and any tests or test code you deem 
necessary - no need to package class files.
- Solve the problem in Java, C# or in a specific language that you may have been directed to use.
- Solve the problem as though it were "production level" code.
- It is not required to provide any graphical interface.

In order to get around firewall issues we recommend the solution be packaged as a password protected zip file.

## Dev environment
If you have Java 8 and internet connectivity you should be able to run this.
Project is relatively IDE agnostic (but IntelliJ rocks).
 
Make sure you run `./gradlew` & make sure tests + quality checks pass prior to each commit.  If you try to push and 
someone else has committed during that time, make sure you pull and run your tests again successfully before to trying 
to push again.

# Run Tests
`./gradlew build` will run tests.

 # Run Locally
 `java -jar build\libs\rpncalculator-1.0.0-SNAPSHOT-all.jar` or
 using gradle `./gradlew runShadow` will build shadow jar containing all dependencies and execute it.