package org.example;
public class BiathlonAthlete implements Comparable<BiathlonAthlete> {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private String skiTimeResult;
    private String firstShooting;
    private String secondShooting;
    private String thirdShooting;

    public BiathlonAthlete(int athleteNumber, String athleteName, String countryCode, String skiTimeResult, String fistShooting, String secondShooting, String thirdShooting) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShooting = fistShooting;
        this.secondShooting = secondShooting;
        this.thirdShooting = thirdShooting;
    }
    public String getAthleteName() {
        return this.athleteName;
    }

    private ShotResult calculateShotResult(char shot) {
        return shot == 'x' ? ShotResult.HIT : ShotResult.MISS;
    }
    public int getTotalPenalty() {
        return this.countPenalty(this.firstShooting) +
                this.countPenalty(this.secondShooting) +
                this.countPenalty(this.thirdShooting);
    }
    private int countPenalty(String shootingResult) {
        int penalty = 0;
        for (char c : shootingResult.toCharArray()) {
            if (calculateShotResult(c) == ShotResult.MISS) {
                penalty += 10;
            }
        }
        return penalty;
    }

    public String getFinalTime() {
        int totalPenalty = this.getTotalPenalty();
        String[] timeParts = this.skiTimeResult.split(":");
        int minutes = Integer.parseInt(timeParts[0]);
        int seconds = Integer.parseInt(timeParts[1]) + totalPenalty;
        minutes += seconds / 60;
        seconds %= 60;
        return String.format("%02d:%02d", minutes, seconds);
    }

    public int compareTo(BiathlonAthlete otherAthlete) {
        return this.getFinalTimeInSeconds() - otherAthlete.getFinalTimeInSeconds();
    }

    public int getFinalTimeInSeconds() {
        int totalPenalty = this.getTotalPenalty();
        String[] timeparts = this.skiTimeResult.split(":");
        int minutes = Integer.parseInt(timeparts[0]);
        int seconds = Integer.parseInt(timeparts[1]) + totalPenalty;
        return minutes * 60 + seconds;
    }

    public int getAthleteNumber() {
        return athleteNumber;
    }
}
