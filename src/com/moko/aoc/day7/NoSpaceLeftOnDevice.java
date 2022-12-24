package com.moko.aoc.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class NoSpaceLeftOnDevice {

    public void solve() {
        try {
            File file = new File("assets/texts/day7.txt");
            Scanner scanner = new Scanner(file);
            Map<String, Node<Integer>> nodes = new HashMap<>();
            String currentNode = "";
            Node<Integer> root = new Node<>(0);
            Tree<Integer> tree = new Tree<Integer>(root);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                if (data.equals("$ cd /")) {
                    currentNode = "root";
                    System.out.println("$ root");
                } else if (data.equals("$ ls")) {
                    System.out.println("$ ls");
                } else if (data.startsWith("dir ")) {
                    System.out.println("dir: " + data.substring(4));
                    root.addChild(new Node<>(0));
                    root.getLastChildren().setName(data.substring(4));
                    System.out.println("root: " + root.toString());
                    <Node<Integer> fetchedNode = root.getChildrenByName(data.substring(4));
                } else if (Character.isDigit(data.charAt(0))) {
                    System.out.println("file");
                }
                // System.out.println(data);
            }
            scanner.close();
            System.out.println("Day 7 (part1): ");
            System.out.println("Day 7 (part2): ");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
