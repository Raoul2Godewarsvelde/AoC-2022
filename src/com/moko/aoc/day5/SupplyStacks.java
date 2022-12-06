package com.moko.aoc.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class SupplyStacks {

    public ArrayList<Stack<String>> initializeStacks(int width) {
        ArrayList<Stack<String>> stacks = new ArrayList<>(width);
        for (int i = 0; i <= width; i++){
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
            ArrayList<Stack<String>> stacks = initializeStacks(9);
            ArrayList<ArrayList<Integer>> instructions = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (!allDataFetched && data.length() > 0 && data.charAt(0) != ' ') {
                    System.out.println(data.length());
                    int j = 0;
                    for (int i = 1; i <= 33; i += 4) {
                        if (data.charAt(i) != ' ') stacks.get(j).push(String.valueOf(data.charAt(i)));
                        j++;
                        System.out.println(stacks);
                    }
                } else if (!allDataFetched && data.length() == 0) {
                    allDataFetched = true;
                } else if (data.length() > 0 && data.charAt(0) != ' ') {
                    ArrayList<Integer> instruction = new ArrayList<>();
                    instructions.add(instruction);
                    boolean isNumber = false;
                    StringBuilder value = new StringBuilder();
                    for (int i = 0; i < data.length(); i++) {
                        if (data.charAt(i) == ' ') isNumber = !isNumber;
                        else if (isNumber) value.append(data.charAt(i));
                        if ((value.length() > 0 && !isNumber) || i == data.length() - 1) {
                            instructions.get(instructions.size() - 1).add(parseInt(String.valueOf(value)));
                            value = new StringBuilder();
                        }
                    }
                    System.out.println(instructions);
                }
            }
            scanner.close();

            for (ArrayList<Integer> instruction : instructions) {
                for (int i = 0; i < instruction.get(0); i++) {
                    System.out.println(stacks.get(instruction.get(1) - 1).());
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
