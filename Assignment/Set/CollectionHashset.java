package com.bridgelabz.Assignment.Set;

import java.util.HashSet;
import java.util.Set;

public class CollectionHashset implements CollectionHashsetInterface{
    Set<Integer> hashset = new HashSet<>();
    @Override
    public void addIntohashset() {
        hashset.add(10);
        hashset.add(2);
        hashset.add(87);
        hashset.add(98);
        hashset.add(54);
        hashset.add(23);
        System.out.println("printing original hashset");
        display();
        System.out.println();
        System.out.println("Triying to add duplicate element 23 ");
        hashset.add(23);
        System.out.println("Hashset will ignore those element which is already present in hashset");
        display();
        System.out.println();
        System.out.println("Remaoving 23");
        hashset.remove(23);
        display();
        System.out.println();
        System.out.println("Contains function checl 23 is present or not");
//        hashset.stream().filter(hashset->);
        System.out.println(hashset.contains(23));
        System.out.println("isEmpty()");
        System.out.println(hashset.isEmpty());
        System.out.println("Size()");
        System.out.println(hashset.size());
        System.out.println("clear()");
        hashset.clear();
        System.out.println("Check is there any element after clear");
        System.out.println(hashset.isEmpty());
    }
    public void display(){
        hashset.stream().forEach(x-> System.out.print(x+" "));
    }

    public static void main(String[] args) {
        CollectionHashset collectionHashset=  new CollectionHashset();
        collectionHashset.addIntohashset();
    }
}
