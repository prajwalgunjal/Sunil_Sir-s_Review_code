package com.bridgelabz.Assignment.Set;

import java.util.HashSet;
import java.util.Set;

public class StudentHashset {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student(1,"prajwal"));
        students.add(new Student(2,"suranjan"));
        students.add(new Student(3,"dadasaheb"));
        students.add(new Student(4,"sarika"));
        students.add(new Student(5,"prajkta"));
        System.out.println(students);
    }
}
