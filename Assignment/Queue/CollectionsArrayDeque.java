package com.bridgelabz.Assignment.Queue;

import java.util.ArrayDeque;

public class CollectionsArrayDeque implements ArrayDequeInterface {
    ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
    @Override
    public void addToarraydeque() {
        arrayDeque.offer(10);
        arrayDeque.offer(20);
        arrayDeque.offer(30);
        arrayDeque.offer(40);
        arrayDeque.offer(50);
        System.out.println("Original arrayDeque");
        display();
        System.out.println();
        System.out.println("Adding element from front");
        arrayDeque.addFirst(100);
        arrayDeque.addFirst(400);
        display();
        System.out.println();
        System.out.println("adding element form last");
        arrayDeque.offerLast(500);
        arrayDeque.offerLast(600);
        display();
        System.out.println();
        System.out.println("peek() method");
        System.out.println(arrayDeque.peek());
        System.out.println("PeekFirst() method");
        System.out.println(arrayDeque.peekFirst());
        System.out.println("peekLast() method");
        System.out.println(arrayDeque.peekLast());
        System.out.println("poll()");
        System.out.println(arrayDeque.poll());
        System.out.println("pollFirst()");
        System.out.println(arrayDeque.pollFirst());
        System.out.println("pollLast()");
        System.out.println(arrayDeque.pollLast());
        System.out.println("Printing updated ArrayDeque");
        display();
    }
    void display(){
        arrayDeque.stream().forEach(x-> System.out.print(x+" "));
    }

    public static void main(String[] args) {
        CollectionsArrayDeque collectionsArrayDeque = new CollectionsArrayDeque();
        collectionsArrayDeque.addToarraydeque();
    }
}