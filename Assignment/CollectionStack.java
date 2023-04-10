package com.bridgelabz.Assignment;
import java.util.Stack;
public class CollectionStack implements StackInterface{
    Stack<String> stack = new Stack<>();
    int count =0;
    @Override
    public void addToStack() {
        stack.push("prajwal");
        stack.push("prajkta");
        stack.push("sarika");
        stack.push("Dadasaheb");
        System.out.println();
        System.out.println("Original stack");
        display();
        System.out.println();
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println("Peek at the top element: " + stack.peek());
        System.out.println("Pop elements off the stack elements : ");
        while (!stack.empty()) {
            count=count+1;
            System.out.println(count+") popped element:- "+stack.pop() + " ");
        }
        System.out.println();
        System.out.println("Is stack empty? " + stack.empty());
    }
    public void display(){
//        stack.stream().forEach(System.out::println);
        for(int i=stack.size()-1;i>=0;i--){
            System.out.print(stack.get(i)+" ");
        }
    }
    public static void main(String[] args) {
        CollectionStack collectionStack = new CollectionStack();
        collectionStack.addToStack();
        }
}