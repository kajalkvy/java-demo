package com.dataStructure;

import java.util.EmptyStackException;

public class Stack {
    ListNode top=null;
    int length=0;
    public void push(int data){
        ListNode node =new ListNode(data);
        node.next=top;
        top=node;
        length++;
    }
    public int pop(){
        if(length==0){
            throw new EmptyStackException();
        }else{
            int removeData=top.data;
            top=top.next;
            length--;
            return removeData;
        }
    }
    public int peek(){
        if(length==0){
            throw new EmptyStackException();
        }
        return top.data;
    }
    public void printStack(){
        System.out.print("Stack : ");
        ListNode node= top;
        if(length==0){
            throw new EmptyStackException();
        }
        else {
            while (node != null) {
                System.out.print(node.data+" ");
                node = node.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.printStack();

        System.out.println(stack.peek());
        System.out.println("length of stack : "+stack.length);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("length of stack : "+stack.length);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println("length of stack : "+stack.length);

        stack.printStack();
    }

}
