package com.moko.aoc.day7;

import java.util.ArrayList;
import java.util.Collections;

public class Node<T> {
    private T data;
    private ArrayList<Node> neighbors;

    public Node(int data, Node<Integer> neighbors) {
        this.data = data;
        this.neighbors = new ArrayList<>();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node[] getNeighbors() {
        return neighbors.toArray(new Node[0]);
    }

    public void setNeighbors(Node[] neighbors) {
        Collections.addAll(this.neighbors, neighbors);
    }
}
