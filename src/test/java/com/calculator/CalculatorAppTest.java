package com.calculator;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

public class CalculatorAppTest {

    @Mock
    Scanner mockScanner;

    @Test
    void testApp() {
        mockScanner = Mockito.mock(Scanner.class);
        when(mockScanner.nextLine()).thenReturn("(-2-3)+(10*8)");

        String expression = mockScanner.nextLine();
        double result = Calculator.evaluateExpression(expression);

        System.out.println("Result from mock input: " + result);
        assertEquals(72.0, result);
    }
}
