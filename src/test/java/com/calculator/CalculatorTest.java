package com.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void testSimpleExpression() {
        assertEquals(72.0, Calculator.evaluateExpression("(10*8)"));
    }

    @Test
    void testComplexExpression() {
        assertEquals(72.0, Calculator.evaluateExpression("(-2-3)+(10*8)"));
    }

    @Test
    void testNestedExpression() {
        assertEquals(25.0, Calculator.evaluateExpression("5+(2+(3*2))"));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-10.0, Calculator.evaluateExpression("-2*5"));
    }

}


