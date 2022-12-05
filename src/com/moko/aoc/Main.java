package com.moko.aoc;

import com.moko.aoc.day1.CountingCalories;
import com.moko.aoc.day2.RockPaperScissors;
import com.moko.aoc.day3.RucksackReorganization;
import com.moko.aoc.day4.CampCleanup;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CountingCalories countingCalories = new CountingCalories();
        countingCalories.solve();

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.solve();

        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        rucksackReorganization.solve();

        CampCleanup campCleanup = new CampCleanup();
        campCleanup.solve();
    }
}
