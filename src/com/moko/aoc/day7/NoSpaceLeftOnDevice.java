package com.moko.aoc.day7;

import org.w3c.dom.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoSpaceLeftOnDevice {
    public void solve() {
        try {
            File file = new File("assets/texts/day7.txt");
            Scanner scanner = new Scanner(file);
            Node<Integer> root = new Node<>(0, null);
            Node<Integer> node = new Node<>(0, root);
            System.out.println(root.getData());
            // System.out.println(node.getNext().getData());
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                // System.out.println(data);
            }
            System.out.println("Day 7 (part1): ");
            System.out.println("Day 7 (part2): ");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
