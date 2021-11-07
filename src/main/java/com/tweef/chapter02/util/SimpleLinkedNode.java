package com.tweef.chapter02.util;

public class SimpleLinkedNode<T> {
    private T content;
    private SimpleLinkedNode<T> next;

    public SimpleLinkedNode(T content, SimpleLinkedNode<T> next) {
        this.content = content;
        this.next = next;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public SimpleLinkedNode<T> getNext() {
        return next;
    }

    public void setNext(SimpleLinkedNode<T> next) {
        this.next = next;
    }
}
