package com.linkedlist;

import java.util.Iterator;

public class Node<T> implements Iterable<T> {

    private final T value;
    private final Node<T> next;

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getNext() {
        return next;
    }

    @Override
    public Iterator<T> iterator() {
        return new NodeIterator(this);
    }

    private class NodeIterator implements Iterator<T> {

        private Node<T> currentNode;

        public NodeIterator(Node<T> startNode) {
            this.currentNode = startNode;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            T value = currentNode.value;
            currentNode = currentNode.next;
            return value;
        }
    }
}
