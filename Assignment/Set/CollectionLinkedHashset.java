package com.bridgelabz.Assignment.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionLinkedHashset implements CollectionLinkedHashsetInterface{
    Set<Integer> linkedHashset = new LinkedHashSet<>();
    @Override
    public void addTolinkedHashset() {
        linkedHashset.add(10);
        linkedHashset.add(2);
        linkedHashset.add(87);
        linkedHashset.add(98);
        linkedHashset.add(54);
        linkedHashset.add(23);
        System.out.println("printing original linkedHashset");
        display();
        System.out.println();
        System.out.println("Triying to add duplicate element 23 ");
        linkedHashset.add(23);
        System.out.println("Hashset will ignore those element which is already present in linkedHashset");
        display();
        System.out.println();
        System.out.println("Remaoving 23");
        linkedHashset.remove(23);
        display();
        System.out.println();
        System.out.println("Contains function checl 23 is present or not");
//        hashset.stream().filter(hashset->);
        System.out.println(linkedHashset.contains(23));
        System.out.println("isEmpty()");
        System.out.println(linkedHashset.isEmpty());
        System.out.println("Size()");
        System.out.println(linkedHashset.size());
        System.out.println("clear()");
        linkedHashset.clear();
        System.out.println("Check is there any element after clear");
        System.out.println(linkedHashset.isEmpty());

    }
    public void display(){
        linkedHashset.stream().forEach(x-> System.out.print(x+" "));

    }

    public static void main(String[] args) {
        CollectionLinkedHashset collectionLinkedHashset = new CollectionLinkedHashset();
        collectionLinkedHashset.addTolinkedHashset();
    }
}
