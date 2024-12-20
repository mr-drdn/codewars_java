package kuy_8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.kata.kyu_8.GrassHopper;
import org.testng.annotations.Test;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                GrassHopper.findAverage(new int[]{1}));
    }
    @Test
    public void test2() {
        assertEquals(4,
                GrassHopper.findAverage(new int[]{1,3,5,7}));
    }
}
