package com.company.algorithm;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DequeDemo {

    public static void main(String[] args) {

    Deque<String> deque = new LinkedList<String>();
    deque.push("a");
    deque.push("b");
    deque.push("c");
    System.out.println(deque);
    String str = deque.peek();
    System.out.println(str);
    System.out.println(deque);
    while(deque.size()>0)

    {
        System.out.println(deque.pop());
    }
    System.out.println(deque);

    addDeque();

    Queue.class;
        PriorityQueue.class
}
    public static void addDeque() {
        Deque<String> deque = new LinkedList<String>();
        deque.addFirst("d");
        deque.addFirst("e");
        deque.addFirst("f");
        System.out.println(deque);
        deque.addLast("c");
        deque.addLast("b");
        deque.addLast("a");
        System.out.println(deque);
        boolean str = deque.contains("c");
        System.out.println(str);
        deque.remove("d");
        System.out.println(deque);

    }
}
