package com.moko.aoc.day6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TuningTrouble {

    private boolean areUnique(ArrayList<String> queue) {
        int queueSize = queue.size();
        ArrayList<String> bufferQueue = new ArrayList<>();
        for (String s : queue) {
            if (!bufferQueue.contains(s)) bufferQueue.add(s);
        }
        return (bufferQueue.size() == queueSize);
    }

    private int getValue(String data, ArrayList<String> queue, int size) {
        int value = 0;
        for (int i = 0; i < data.length(); i++) {
            if (i < size) queue.add(String.valueOf(data.charAt(i)));
            else {
                queue.add(String.valueOf(data.charAt(i)));
                queue.remove(0);
                ArrayList<String> queueCopy = new ArrayList<>(queue);
                if (areUnique(queueCopy)) {
                    value = i + 1;
                    break;
                }
            }
        }
        return value;
    }
    public void solve() {
        try {
            File file = new File("assets/texts/day6.txt");
            Scanner scanner = new Scanner(file);
            String data = scanner.nextLine();
            scanner.close();
            ArrayList<String> queuePart1 = new ArrayList<>();
            ArrayList<String> queuePart2 = new ArrayList<>();
            System.out.println("Day 6 (part1): " + getValue(data, queuePart1, 4));
            System.out.println("Day 6 (part2): " + getValue(data, queuePart2, 14));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
