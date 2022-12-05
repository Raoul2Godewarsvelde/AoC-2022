package com.moko.aoc;

import com.moko.aoc.day1.CountingCalories;
import com.moko.aoc.day2.RockPaperScissors;
import com.moko.aoc.day3.RucksackReorganization;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        CountingCalories countingCalories = new CountingCalories();
        countingCalories.getResult();

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.getResult();

        RucksackReorganization rucksackReorganization = new RucksackReorganization();
        rucksackReorganization.getResult();
    }
}
