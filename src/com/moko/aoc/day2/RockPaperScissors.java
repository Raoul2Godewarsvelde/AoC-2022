package com.moko.aoc.day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RockPaperScissors {

    public int getFirstScore(char him , char me) {
        switch (him) {
            case 'A' -> {
                return me == 'Z' ? 3 : me == 'X' ? (1 + 3) : (2 + 6);
            }
            case 'B' -> {
                return me == 'X' ? 1 : me == 'Y' ? (2 + 3) : (3 + 6);
            }
            case 'C' -> {
                return me == 'Y' ? 2 : me == 'Z' ? (3 + 3) : (1 + 6);
            }
            default -> {
                return 0;
            }
        }
    }

    public int getSecondScore(char him , char me) {
        switch (him) {
            case 'A' -> {
                return me == 'X' ? 3 : me == 'Y' ? (1 + 3) : (2 + 6);
            }
            case 'B' -> {
                return me == 'X' ? 1 : me == 'Y' ? (2 + 3) : (3 + 6);
            }
            case 'C' -> {
                return me == 'X' ? 2 : me == 'Y' ? (3 + 3) : (1 + 6);
            }
            default -> {
                return 0;
            }
        }
    }

    public void getResult() {
        try {
            File file = new File("assets/texts/day2.txt");
            Scanner scanner = new Scanner(file);
            int firstScore = 0;
            int secondScore = 0;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                firstScore += getFirstScore(data.charAt(0), data.charAt(2));
                secondScore += getSecondScore(data.charAt(0), data.charAt(2));
            }
            scanner.close();
            System.out.println("Day 2 (part1): " + firstScore);
            System.out.println("Day 2 (part2): " + secondScore);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
