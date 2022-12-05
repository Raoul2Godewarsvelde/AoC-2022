package com.moko.aoc.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class CountingCalories {

    public void solve() {
        try {
            File file = new File("assets/texts/day1.txt");
            Scanner scanner = new Scanner(file);
            ArrayList<Integer> caloriesForEachElf = new ArrayList<>();
            int caloriesOfOneElf = 0;
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if(!Objects.equals(data, "")) {
                    caloriesOfOneElf += parseInt(data);
                } else {
                    caloriesForEachElf.add(caloriesOfOneElf);
                    caloriesOfOneElf = 0;
                }
            }
            caloriesForEachElf.sort(Collections.reverseOrder());
            scanner.close();
            System.out.println("Day 1 (part1): " + caloriesForEachElf.get(0));
            System.out.println("Day 1 (part2): " + (caloriesForEachElf.get(0) + caloriesForEachElf.get(1) + caloriesForEachElf.get(2)));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
