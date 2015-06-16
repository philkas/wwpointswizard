package pika.de.wwpointswizard2.core.wwpoints.simple.calculation;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pika on 16.06.15.
 */
public class CalculatorTest {
    @Test
    public void testCalculatePoints() throws Exception {
        Calculator calc = new Calculator(
                BodySize.TALL,
                Gender.MALE,
                Motion.NONE,
                DietTarget.KEEP,
                73);
        double exp = 2.0 + 15.0 + 0.0 + 4.0 + 7.0;
        assertEquals(exp, calc.calculatePoints(), 0.0);
    }
}