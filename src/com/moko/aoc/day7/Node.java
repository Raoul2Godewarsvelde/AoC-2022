package com.moko.aoc.day7;

import java.util.ArrayDeque;
import java.util.Iterator;

public class Node<T> {

    private String name;
    private T data;
    private final ArrayDeque<Node<T>> childrens;
    private Node<T> parent;

    public Node(T data) {
        this.data = data;
        this.childrens = new ArrayDeque<Node<T>>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void addChild(Node<T> child) {
        child.setParent(this);
        childrens.add(child);
    }

    public Node<T> getLastChildren() {
        return this.childrens.getLast();
    }

    public <Node<T> getChildrenByName(String name) {
        Iterator<Node<T>> node = this.childrens.iterator();
        System.out.println(node.toString());
        while(node.hasNext()) {
            if (node.next().getName().equals(name)) {
                System.out.println("------------------------>" + node.next().getName());
                return (Node) node;
            }
        }
        return null;
    }

    public Node<T> getParent() {
        return this.parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return this.childrens.toString();
    }
}
