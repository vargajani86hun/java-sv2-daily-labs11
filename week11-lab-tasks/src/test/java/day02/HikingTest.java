package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testHiking() {
        Hiking hiking = new Hiking();
        assertEquals(13., hiking.getPlusElevation(
                Arrays.asList(10., 20., 15., 18.)));
    }

    @Test
    void testFullyElevation() {
        assertEquals(20., new Hiking().getPlusElevation(List.of(10., 14., 20., 23., 28., 30.)));
    }

    @Test
    void testFullySlope() {
        assertEquals(0, new Hiking().getPlusElevation(List.of(30., 26., 22., 19., 13., 7., 2.)));
    }
}