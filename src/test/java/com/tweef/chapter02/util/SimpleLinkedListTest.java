package com.tweef.chapter02.util;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLinkedListTest {

    @Test
    public void addNodeTest() {
        SimpleLinkedList<Integer> lista = new SimpleLinkedList<>(1);
        lista.addNode(2);
        lista.addNode(3);
        lista.addNode(4);
        lista.addNode(5);
        System.out.println(lista);

        Assert.assertEquals(Integer.valueOf(5), lista.getSize());

        SimpleLinkedNode<Integer> head = lista.getHead();

        Assert.assertEquals(Integer.valueOf(1), head.getContent());

        head = head.getNext();
        Assert.assertEquals(Integer.valueOf(2), head.getContent());

        head = head.getNext();
        Assert.assertEquals(Integer.valueOf(3), head.getContent());

        head = head.getNext();
        Assert.assertEquals(Integer.valueOf(4), head.getContent());

        head = head.getNext();
        Assert.assertEquals(Integer.valueOf(5), head.getContent());

        head = head.getNext();
        Assert.assertNull(head);


    }
}
