package com.moko.aoc;

import com.moko.aoc.day1.CountingCalories;
import com.moko.aoc.day2.RockPaperScissors;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        CountingCalories countingCalories = new CountingCalories();
        countingCalories.getResult();

        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.getResult();
    }
}
