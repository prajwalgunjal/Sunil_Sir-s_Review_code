package com.bridgelabz.Assignment.map;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Collectionhashmap implements CollectionHashmapinterface{
Map<String, Integer> numbers = new HashMap<>();
    @Override
    public void addtoHashmap() {
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3);
//      display();
        if(!numbers.containsKey("Two")){
            numbers.put("Two",23);
        }
        numbers.putIfAbsent("Four",4);
        System.out.println("Replace()");
        System.out.println(numbers.containsKey("Three"));
        System.out.println(numbers.containsValue(300));
        numbers.replace("ten",4);
        System.out.println(numbers);
        System.out.println("Remove()");
        numbers.remove("Three");
        System.out.println("Display key & value :- ");
        for (Map.Entry<String ,Integer> entry : numbers.entrySet()) {
            System.out.println("Key :- " + entry.getKey() + ", Value :- " + entry.getValue());
        }
        System.out.println("Updating an element in the HashMap using merge() method");
        numbers.merge("One", 1, Integer::sum);
        System.out.println("Updated HashMap Elements: " + numbers);
        System.out.println();


        System.out.println("filtering elements whose value is greater than 0");
        Map<String, Integer> filteredMap = numbers.entrySet().stream().filter(entry -> entry.getValue() > 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered HashMap Elements: " + filteredMap);
        System.out.println();

        System.out.println("adding keyvalue's in hashmap");
        int sum = numbers.values().stream().reduce(0, Integer::sum);
        System.out.println("Sum of HashMap values: " + sum);

        System.out.println("filtering elements whose key is divided by 2");
        Map<String, Integer> filteredMap2 = numbers.entrySet().stream().filter(entry -> entry.getKey() % 2 == 0).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println("Filtered HashMap Elements: " + filteredMap2);
        System.out.println();

        System.out.println("printing map1 using stream (map) ");
        Map<String, Integer> mappedMap2 = numbers.entrySet().stream().collect(Collectors.toMap(entry -> entry.getValue().toUpperCase(), Map.Entry::getKey));
        System.out.println("Mapped HashMap Elements: " + mappedMap2);
        System.out.println();

        // Reduce elements
        System.out.println("adding keyvalue's in hashmap");
        int sum2 = numbers.values().stream().mapToInt(String::length).sum();
        System.out.println("Sum of lengths of HashMap values: " + sum2);
    }

    public static void main(String[] args) {
        Collectionhashmap collectionhashmap = new Collectionhashmap();
        collectionhashmap.addtoHashmap();
    }
}