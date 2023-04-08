package com.bridgelabz;

public class Student {
    static void calculateAverage(){
        int totalMarks=400;
        int sub1=80;
        int sub4=80;
        int sub2=80;
        int sub3=80;
        int sum=sub1+sub2+sub3+sub4;

        int avg=sum/(400) * 100;
        System.out.println("Total marks of the sudent is"+sum);
        System.out.println("Total marks of the sudent is"+avg);

    }
    public static void main(String[] args) {
        calculateAverage();
    }
}
