package org.example;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String csvData = "11,Jimmy Hoffa,USA,30:27,xxxox,xxxxx,xxoxo\n" +
                "1,Winston Churchill,UK,29:15,xxoox,xooxo,xxxxo\n" +
                "16,Charlie Sheen,USA,30:10,xxxxx,xxxxx,xxxxx";
        BiathlonCompetition competition = new BiathlonCompetition(csvData);
        competition.runCompetition();
    }
}