package com.moko.aoc.day5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SupplyStacks {

    public void solve() {
        try {
            File file = new File("assets/texts/day5.txt");
            Scanner scanner = new Scanner(file);
            int maxLengthOfInitialArrays = 0;
            boolean allDataFetched = false;
            List<Queue<String>> queues = new ArrayList<Queue<String>>(9);
            Queue<String> queue1 = new LinkedList<>();
            Queue<String> queue2 = new LinkedList<>();
            Queue<String> queue3 = new LinkedList<>();
            Queue<String> queue4 = new LinkedList<>();
            Queue<String> queue5 = new LinkedList<>();
            Queue<String> queue6 = new LinkedList<>();
            Queue<String> queue7 = new LinkedList<>();
            Queue<String> queue8 = new LinkedList<>();
            Queue<String> queue9 = new LinkedList<>();
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if(!allDataFetched && data.length() > 0 && data.charAt(0) != ' ') {
                    System.out.println(data.length());
                    if (data.charAt(1) != ' ') queue1.add(String.valueOf(data.charAt(1)));
                    if (data.charAt(5) != ' ') queue2.add(String.valueOf(data.charAt(5)));
                    if (data.charAt(9) != ' ') queue3.add(String.valueOf(data.charAt(9)));
                    if (data.charAt(13) != ' ') queue4.add(String.valueOf(data.charAt(13)));
                    if (data.charAt(17) != ' ') queue5.add(String.valueOf(data.charAt(17)));
                    if (data.charAt(21) != ' ') queue6.add(String.valueOf(data.charAt(21)));
                    if (data.charAt(25) != ' ') queue7.add(String.valueOf(data.charAt(25)));
                    if (data.charAt(29) != ' ') queue8.add(String.valueOf(data.charAt(29)));
                    if (data.charAt(33) != ' ') queue9.add(String.valueOf(data.charAt(33)));
                } else {
                    allDataFetched = true;
                }
            }
            System.out.println("Elements of queue1 " + queue1);
            System.out.println("Elements of queue2 " + queue2);
            System.out.println("Elements of queue3 " + queue3);
            System.out.println("Elements of queue4 " + queue4);
            System.out.println("Elements of queue5 " + queue5);
            System.out.println("Elements of queue6 " + queue6);
            System.out.println("Elements of queue7 " + queue7);
            System.out.println("Elements of queue8 " + queue8);
            System.out.println("Elements of queue9 " + queue9);
            System.out.println("Day 5 (part1): ");
            System.out.println("Day 5 (part2): ");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
