package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/Resources/cvsData.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            StringBuilder csvData = new StringBuilder();

            while ((line = bufferedReader.readLine()) != null) {
                csvData.append(line).append("\n");
            }

            BiathlonCompetition competition = new BiathlonCompetition(csvData.toString());
            competition.runCompetition();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}