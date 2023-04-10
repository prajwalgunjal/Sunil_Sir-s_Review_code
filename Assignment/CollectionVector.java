package com.bridgelabz.Assignment;
import java.util.Vector;
public class CollectionVector implements VectorInterface {
    Vector<Integer> v = new Vector<>();
    @Override
    public void addInVector() {
        System.out.println("Adding items into vector");
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);
        v.add(50);
        v.add(60);
        // Insert an element at index 1
        v.insertElementAt(0, 1);
        System.out.println("before remove ");
        display();
        // Remove the element at index 2
        System.out.println();
        System.out.println("After removing 20");
        v.removeElementAt(2);
        v.remove(1);
        System.out.println("Zeroth index is replaced with 21: "+ v.set(0, 21));
        System.out.println("forth index is replaced with 50" + v.set(4, 50));
    }
    public void display(){
        v.stream().forEach(v -> System.out.print(v+" "));
    }
    public static void main(String[] args) {
        CollectionVector collectionVector = new CollectionVector();
        collectionVector.addInVector();
        collectionVector.display();
    }
}