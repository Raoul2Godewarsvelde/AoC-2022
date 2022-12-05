package com.moko.aoc.day3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RucksackReorganization {

    public char getDuplicatedItem(String rucksack) {
        char sharedItem = '_';
        int compartmentLength = rucksack.length() / 2;
        String[] compartments = {rucksack.substring(0, compartmentLength), rucksack.substring(compartmentLength)};
        for (int i = 0; i < compartmentLength; i++)
            if (compartments[1].contains(Character.toString(compartments[0].charAt(i)))) {
                sharedItem = compartments[0].charAt(i);
                break;
            }
        return sharedItem;
    }

    public int getRucksackPriority(String rucksack, String priorityValues) {
        return priorityValues.indexOf(getDuplicatedItem(rucksack)) + 1;
    }

    public char getSharedItem(List<String> rucksackGroup) {
        char sharedItem = '_';
        for (int i = 0; i < rucksackGroup.get(0).length(); i++) {
            if (rucksackGroup.get(1).contains(Character.toString(rucksackGroup.get(0).charAt(i)))) {
                if (rucksackGroup.get(2).contains(Character.toString(rucksackGroup.get(0).charAt(i)))) {
                    sharedItem = rucksackGroup.get(0).charAt(i);
                    break;
                }
            }
        }
        return sharedItem;
    }

    public int getRucksackGroupPriority(List<String> rucksackGroup, String priorityValues) {
        return priorityValues.indexOf(getSharedItem(rucksackGroup)) + 1;
    }

    public void getResult() {
        try {
            File file = new File("assets/texts/day3.txt");
            Scanner scanner = new Scanner(file);
            int firstSum = 0;
            int secondSum = 0;
            String priorityValues = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            int i = 0;
            List<String> rucksackGroup = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                firstSum += getRucksackPriority(data, priorityValues);
                rucksackGroup.add(data);
                i++;
                if(i == 3) {
                    secondSum += getRucksackGroupPriority(rucksackGroup, priorityValues);
                    rucksackGroup.clear();
                    i = 0;
                }
            }
            System.out.println("Day 3 (part1): " + firstSum);
            System.out.println("Day 3 (part2): " + secondSum);
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
