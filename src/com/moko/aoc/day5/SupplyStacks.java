package com.moko.aoc.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SupplyStacks {

    public ArrayList<Stack<String>> initialzeStacks(int width, int height) {
        ArrayList<Stack<String>> stacks = new ArrayList<>(9);
        for (int i = 0; i <= 9; i++){
            Stack<String> stack = new Stack<>();
            stacks.add(stack);
        }
        System.out.println(stacks);
        return stacks;
    }

    public void solve() {
        try {
            File file = new File("assets/texts/day5.txt");
            Scanner scanner = new Scanner(file);

            boolean allDataFetched = false;
            ArrayList<Stack<String>> stacks = initialzeStacks(9, 8);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if(!allDataFetched && data.length() > 0 && data.charAt(0) != ' ') {
                    System.out.println(data.length());
                    int j = 0;
                    for (int i = 1; i <= 33; i += 4) {
                        if (data.charAt(i) != ' ') stacks.get(j).push(String.valueOf(data.charAt(i)));
                        j++;
                        System.out.println(stacks);
                    }
                } else {
                    allDataFetched = true;
                }
            }
            System.out.println("Day 5 (part1): ");
            System.out.println("Day 5 (part2): ");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
