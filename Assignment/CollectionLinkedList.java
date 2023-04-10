package com.bridgelabz.Assignment;
import java.util.LinkedList;
public class CollectionLinkedList implements LinkedListInterface {
    LinkedList<String> myList = new LinkedList<>();
    @Override
    public void addTolinkedlist() { // create a new linked list
        // add some elements to the linked list
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        System.out.println("original linked list");
        display();
        myList.addFirst("pear");
        System.out.println("Linked list elements after adding at beginning:");
        display();
        System.out.println();
        myList.addLast("grape");
        System.out.println("Linked list elements after adding at end:");
        display();
        System.out.println();
        String firstElement = myList.getFirst();
        System.out.println("First element: " + firstElement);
        String lastElement = myList.getLast();
        System.out.println("Last element: " + lastElement);
        myList.removeFirst();
        System.out.println("Linked list elements after removing first element:");
        display();
        System.out.println();
        myList.removeLast();
        System.out.println("Linked list elements after removing last element:");
        display();
        System.out.println();
        myList.remove("banana");
        System.out.println("Linked list elements after removing banana:");
        display();
        System.out.println();
        int size = myList.size();
        System.out.println("Size of linked list: " + size);
        boolean contains = myList.contains("orange");
        System.out.println("Linked list contains orange? " + contains);
    }
    public void display(){
        // display the elements of the linked list
        myList.stream().forEach(x-> System.out.print(x+" -> "));
    }
    public static void main(String[] args) {
        CollectionLinkedList collectionLinkedList = new CollectionLinkedList();
        collectionLinkedList.addTolinkedlist();
        }
}