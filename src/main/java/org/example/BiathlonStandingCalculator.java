package org.example;
import java.util.Collections;
import java.util.List;

public class BiathlonStandingCalculator {
    public BiathlonStandingCalculator() {
    }
    public static List<BiathlonAthlete> calculateStanding(List<BiathlonAthlete> athletes) {
        Collections.sort(athletes);
        return athletes;
    }
}
