package com.linkedlist;

public class Traversal<T> {

    @SuppressWarnings("unchecked")
    public Node<T>[] reverse(Node<T> start) {
        Node<T> currentNode = start;
        Node<T> oddNewListNode = null;
        Node<T> evenNewListNode = null;
        int counter = 0;
        while (currentNode != null) {
            if (counter % 2 == 0) {
                evenNewListNode = new Node<>(currentNode.getValue(), evenNewListNode);
            } else {
                oddNewListNode = new Node<>(currentNode.getValue(), oddNewListNode);
            }
            currentNode = currentNode.getNext();
            counter++;
        }
        return new Node[]{evenNewListNode, oddNewListNode};
    }
}
