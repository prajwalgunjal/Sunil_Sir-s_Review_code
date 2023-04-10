package com.bridgelabz.Assignment.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CollectionsPriorityQueue implements PriorityQueueInterface{
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    PriorityQueue<Integer> pqmaxheap = new PriorityQueue<>(Comparator.reverseOrder());

    @Override
    public void addTopriorityqueue() {
        System.out.println("This is the eg of min heap ");
        pq.offer(100);
        pq.offer(2);
        pq.offer(387);
        pq.offer(47);
        pq.offer(650);
        pq.offer(63);
        System.out.println("Printing original Priority Queue");
        display();
        System.out.println();
        System.out.println("removing element which having highest priority ");
        pq.poll();
        System.out.println("after removing element which having highest priority");
        display();
        System.out.println();
        System.out.println("Printing Element with highest priority:- "+pq.peek());
    }

    public void add(){
        System.out.println("**************************");
        System.out.println("This is the eg of max heap");
         pqmaxheap.offer(4);
        pqmaxheap.offer(48);
        pqmaxheap.offer(74);
        pqmaxheap.offer(66);
        pqmaxheap.offer(87);
        pqmaxheap.offer(54);
        pqmaxheap.offer(23);
        pqmaxheap.stream().forEach(x-> System.out.print(x+" "));
    }
    public void display(){
        // this will print smallest element at first position because of highest priority will be provided to that element
        pq.stream().forEach(x-> System.out.print(x+" "));
    }

    public static void main(String[] args) {
        CollectionsPriorityQueue collectionsPriorityQueue = new CollectionsPriorityQueue();
        collectionsPriorityQueue.addTopriorityqueue();
        collectionsPriorityQueue.add();
    }
}
