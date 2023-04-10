package com.bridgelabz.Assignment.Set;

import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeset implements CollectionTreesetInterface{
    Set<Integer> treeset = new TreeSet<>();
    @Override
    public void addtoTreeset() {
        treeset.add(10);
        treeset.add(2);
        treeset.add(87);
        treeset.add(98);
        treeset.add(54);
        treeset.add(23);
        System.out.println("printing original hashset");
        display();
        System.out.println();
        System.out.println("Triying to add duplicate element 23 ");
        treeset.add(23);
        System.out.println("Hashset will ignore those element which is already present in hashset");
        display();
        System.out.println();
        System.out.println("Remaoving 23");
        treeset.remove(23);
        display();
        System.out.println();
        System.out.println("Contains function checl 23 is present or not");
//        hashset.stream().filter(hashset->);
        System.out.println(treeset.contains(23));
        System.out.println("isEmpty()");
        System.out.println(treeset.isEmpty());
        System.out.println("Size()");
        System.out.println(treeset.size());
        System.out.println("clear()");
        treeset.clear();
        System.out.println("Check is there any element after clear");
        System.out.println(treeset.isEmpty());
    }
    public void display(){
        treeset.stream().forEach(x-> System.out.print(x+" "));

    }

    public static void main(String[] args) {
        CollectionTreeset collectionTreeset = new CollectionTreeset();
        collectionTreeset.addtoTreeset();
    }
}
