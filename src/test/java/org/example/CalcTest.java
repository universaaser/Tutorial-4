package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    int result;
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }
    @Test
    public void testSubtraction() {
        CalcTest  calculator = new CalcTest ();
        int result = calculator.subtract(10, 5);

    }

    private int subtract(int a, int b) {
        a = a - b;
        return result;
    }

}
