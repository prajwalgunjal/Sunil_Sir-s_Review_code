/// WAP to rearrange a given array of unique elements such that every second element of the array is greater
// than its left and right elements.
package com.bridgelabz;

public class Uniquearray {
    public static void swapNumber(int[] array,int a,int b){
        int temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void arrayRearrange(int[] array){

        // 0 1
        for(int i=1;i<array.length;i+=2){
            if(array[i]<array[i-1]){
                swapNumber(array,i-1,i);
            }

            if(array[i]<array.length-1 && array[i+1]>=array[i])
            {
                swapNumber(array,i+1,i);
            }
        }
    }
    static void print(int[] array){
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args){
        int[] array={1,2,3,4,8,5,9,7};
        System.out.println("Original Array:- ");
        print(array); ///
        System.out.println();
        System.out.println("after rearranging array");
        System.out.println();
        arrayRearrange(array); ////
        print(array);
    }
}