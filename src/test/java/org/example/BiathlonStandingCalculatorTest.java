package org.example;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class BiathlonStandingCalculatorTest {

    @Test
    public void testCalculateStandings() {
        BiathlonAthlete athlete1 =
                new BiathlonAthlete(11, "John Wick",
                        "USA", "30:27", "xxxox",
                        "xxxxx", "xxoxo");
        BiathlonAthlete athlete2 =
                new BiathlonAthlete(1, "Jimmy Nice",
                        "UK", "29:15", "xxoox",
                        "xooxo", "xxxxo");
        BiathlonAthlete athlete3 =
                new BiathlonAthlete(27, "Peter Brother",
                        "CZ", "30:10", "xxxxx",
                        "xxxxx", "xxxxx");

        List<BiathlonAthlete> athletes = new ArrayList<>();
        athletes.add(athlete1);
        athletes.add(athlete2);
        athletes.add(athlete3);

        List<BiathlonAthlete> standings = BiathlonStandingCalculator.calculateStanding(athletes);

        assertEquals("Peter Brother", standings.get(0).getAthleteName());
        assertEquals("Jimmy Nice", standings.get(1).getAthleteName());
        assertEquals("John Wick", standings.get(2).getAthleteName());
    }
}