package com.bridgelabz.Assignment;
import java.util.ArrayList;
public class CollectionArrayList implements ArraylistInterface {
    @Override
    public void add() {
        ArrayList<String> arrayList = new ArrayList<>();
        // Adding elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Durian");
        display(arrayList);
    }
    void display(ArrayList arrayList){
        // Printing the ArrayList
        System.out.println("ArrayList: " + arrayList);
        // Accessing elements of the ArrayList
            System.out.println("First element: " + arrayList.get(0));
            System.out.println("Third element: " + arrayList.get(2));
            // Replacing an element in the ArrayList
            arrayList.set(1, "Mango");
            System.out.println("After replacing: " + arrayList);
            // Removing an element from the ArrayList
            arrayList.remove(2);
            System.out.println("After removing: " + arrayList);
             //Checking if an element exists in the ArrayList
            System.out.println("Contains 'Apple': " + arrayList.contains("Apple"));
            System.out.println("Contains 'Cherry': " + arrayList.contains("Cherry"));
            // Getting the size of the ArrayList
            System.out.println("Size of the array is : " + arrayList.size());
            // Clearing the ArrayList
            arrayList.clear();
            System.out.println("After clearing: " + arrayList);
    }
        public static void main(String[] args) {
            // Creating an ArrayList object
            CollectionArrayList collectionArrayList = new CollectionArrayList();
            collectionArrayList.add();
        }
}