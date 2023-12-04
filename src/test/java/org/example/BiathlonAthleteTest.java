package org.example;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.assertTrue;

public class BiathlonAthleteTest {

    @Test
    public void testGetTotalPenalty() {
        BiathlonAthlete athlete = new BiathlonAthlete(11, "Jimmy Hoffa",
                "USA", "30:27", "xxxox",
                "xxxxx", "xxoxo");
        assertEquals(30, athlete.getTotalPenalty());
    }
    @Test
    public void testGetFinalTime() {
        BiathlonAthlete athlete = new BiathlonAthlete(11,
                "Jimmy Hoffa", "USA", "30:27",
                "xxxox", "xxxxx", "xxoxo");
        assertEquals("30:57", athlete.getFinalTime());
    }
    @Test
    public void testCompareTo() {
        BiathlonAthlete athlete1 = new BiathlonAthlete(11, "Jimmy Hoffa",
                "USA", "30:27", "xxxox",
                "xxxxx", "xxoxo");
        BiathlonAthlete athlete2 = new BiathlonAthlete(1, "Winston Churchill",
                "UK", "29:15", "xxoox",
                "xooxo", "xxxxo");

        assertTrue(athlete1.compareTo(athlete2) > 0);
    }
}