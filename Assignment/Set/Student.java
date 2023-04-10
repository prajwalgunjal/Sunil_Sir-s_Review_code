package com.bridgelabz.Assignment.Set;

import java.util.Objects;

public class Student {
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }
}
