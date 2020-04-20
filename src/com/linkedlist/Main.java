package com.linkedlist;

public class Main {

    public static void main(String[] args) {
        Node<Integer> third = new Node<>(2, null);
        Node<Integer> second = new Node<>(1, third);
        Node<Integer> first = new Node<>(0, second);

        Traversal<Integer> traversal = new Traversal<>();
        Node<Integer>[] traversed = traversal.reverse(first);

        Node<Integer> even = traversed[0];
        Node<Integer> odd = traversed[1];

        System.out.println("even");
        for (Integer integer : even) {
            System.out.println(integer);
        }

        System.out.println("odd");
        for (Integer integer : odd) {
            System.out.println(integer);
        }
    }
}
