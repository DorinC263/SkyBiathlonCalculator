package org.example;
import java.util.ArrayList;
import java.util.List;
public class BiathlonCompetition {
    private final List<BiathlonAthlete> athletes = new ArrayList<>();

    public BiathlonCompetition(String csvData) {
        this.parseCSV(csvData);
    }
    private void parseCSV(String csvData) {
        String[] lines = csvData.split("\n");
        for (String line : lines) {
            String[] parts = line.split(",");
            int athleteNumber = Integer.parseInt(parts[0]);
            String athleteName = parts[1];
            String countryCode = parts[2];
            String skiTimeResult = parts[3];
            String firstShooting = parts[4];
            String secondShooting = parts[5];
            String thirdShooting = parts[6];
            BiathlonAthlete athlete = new BiathlonAthlete(athleteNumber, athleteName, countryCode, skiTimeResult, firstShooting, secondShooting, thirdShooting);
            this.athletes.add(athlete);
        }
    }
    public void runCompetition() {
        List<BiathlonAthlete> standings = BiathlonStandingCalculator.calculateStanding(this.athletes);
        this.displayStandings(standings);
    }
    private void displayStandings(List<BiathlonAthlete> standings) {
        for (int i = 0; i < standings.size(); ++i) {
            BiathlonAthlete athlete = standings.get(i);
            int penalty = athlete.getTotalPenalty();
            System.out.println(i + 1 + " Place - " + "(" +
                    athlete.getAthleteNumber() + ") " +
                    athlete.getAthleteName() + ", Time: " +
                    athlete.getFinalTime() + ", Penalty: " +
                    penalty + " seconds");
        }
    }
}
