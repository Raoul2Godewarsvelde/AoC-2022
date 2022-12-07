package com.moko.aoc.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Integer.parseInt;

public class SupplyStacks {

    public ArrayList<ArrayDeque<String>> initializeQueues(int width) {
        ArrayList<ArrayDeque<String>> queues = new ArrayList<>(width);
        for (int i = 0; i <= width; i++){
            ArrayDeque<String> stack = new ArrayDeque<>();
            queues.add(stack);
        }
        return queues;
    }

    public void solve() {
        try {
            File file = new File("assets/texts/day5.txt");
            Scanner scanner = new Scanner(file);
            boolean allDataFetched = false;
            ArrayList<ArrayDeque<String>> queues = initializeQueues(8);
            ArrayList<ArrayList<Integer>> instructions = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (!allDataFetched && data.length() > 0 && data.charAt(0) != ' ') {
                    int j = 0;
                    for (int i = 1; i <= 33; i += 4) {
                        if (data.charAt(i) != ' ') queues.get(j).add(String.valueOf(data.charAt(i)));
                        j++;
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
                }
            }
            scanner.close();
            for (ArrayList<Integer> instruction : instructions) {
                for (int i = 0; i < instruction.get(0); i++) {
                    queues.get(instruction.get(2) - 1).offerFirst(queues.get(instruction.get(1) - 1).removeFirst());
                }
            }
            StringBuilder result = new StringBuilder();
            for (ArrayDeque<String> queue : queues) {
                result.append(queue.peekFirst());
            }

            System.out.println("Day 5 (part1): " + result);
            System.out.println("Day 5 (part2): ");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
