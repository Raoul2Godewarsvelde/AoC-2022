package com.moko.aoc.day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class CampCleanup {

    public boolean testFullyAssignment(List<String> assignmentPair) {
        List<String> firstAssignment = List.of(assignmentPair.get(0).split("-"));
        List<String> secondAssignment = List.of(assignmentPair.get(1).split("-"));
        int firstAssignmentStart = parseInt(firstAssignment.get(0));
        int firstAssignmentEnd = parseInt(firstAssignment.get(1));
        int secondAssignmentStart = parseInt(secondAssignment.get(0));
        int secondAssignmentEnd = parseInt(secondAssignment.get(1));
        return (firstAssignmentStart <= secondAssignmentStart) && (firstAssignmentEnd >= secondAssignmentEnd) || (firstAssignmentStart >= secondAssignmentStart) && (firstAssignmentEnd <= secondAssignmentEnd);
    }

    public boolean testPartialAssignment(List<String> assignmentPair) {
        boolean test = true;
        List<String> firstAssignment = List.of(assignmentPair.get(0).split("-"));
        List<String> secondAssignment = List.of(assignmentPair.get(1).split("-"));
        int firstAssignmentStart = parseInt(firstAssignment.get(0));
        int firstAssignmentEnd = parseInt(firstAssignment.get(1));
        int secondAssignmentStart = parseInt(secondAssignment.get(0));
        int secondAssignmentEnd = parseInt(secondAssignment.get(1));
        return firstAssignmentEnd < secondAssignmentStart || secondAssignmentEnd < firstAssignmentStart;
    }

    public void solve() {
        try {
            File file = new File("assets/texts/day4.txt");
            Scanner scanner = new Scanner(file);
            int numberOfFullyPairs = 0;
            int numberOfPartialPairs = 0;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                List<String> assignmentPair = List.of(data.split(","));
                if(testFullyAssignment(assignmentPair)) {
                    numberOfFullyPairs++;
                }
                if(!testPartialAssignment(assignmentPair)) {
                    numberOfPartialPairs++;
                }
            }
            System.out.println("Day 4 (part1): " + numberOfFullyPairs);
            System.out.println("Day 4 (part2): " + numberOfPartialPairs);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
