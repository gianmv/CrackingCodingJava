package com.tweef.chapter02.util;

public class SimpleLinkedList<T> {
    private SimpleLinkedNode<T> head;
    private Integer size;

    public SimpleLinkedList(T content) {
        head = new SimpleLinkedNode<T>(content, null);
        size = 1;
    }

    public SimpleLinkedNode<T> getHead() {
        return head;
    }

    public void addNode(T content) {
        SimpleLinkedNode<T> lastNode = null;
        for (
                SimpleLinkedNode<T> start = head;
                start != null;
                start = start.getNext()) {
            lastNode = start;
        }

        SimpleLinkedNode<T> newLast = new SimpleLinkedNode<>(content, null);
        lastNode.setNext(newLast);
        size++;
    }

    public Integer getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (
                SimpleLinkedNode<T> start = head;
                start != null;
                start = start.getNext()) {
            s.append(String.format("%s->", start.getContent().toString()));
        }
        return s.toString();
    }
}
