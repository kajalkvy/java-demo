package com.dataStructure;

import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    public  Queue(){
        this.front=null;
        this.rear=null;
        this.length=0;
    }
    private class ListNode{
        private int data;
        private  ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }

    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void enqueue(int data){
        ListNode node=new ListNode(data);
        if(isEmpty()) {
            front = node;
        }else{
            rear.next=node;
        }
        rear=node;
        length++;
    }
    void displayQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
        }else{
            ListNode temp=front;
            while(temp!=null){
                System.out.print(temp.data+"---->");
                temp=temp.next;
            }
        }
        System.out.println();
    }
    public int deQueue(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }else {
            int result = front.data;
            front = front.next;
            if (front == null) {
                rear = null;
            }

            length--;
            return result;
        }
    }
    public int first(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty.");
        }
        return front.data;
    }
    public int last(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is already empty.");
        }
        return rear.data;
    }

    public static void main(String[] args) {
      Queue queue=new Queue();
      queue.enqueue(5);
      queue.enqueue(10);
      queue.enqueue(15);
      queue.enqueue(20);
      queue.enqueue(25);

      System.out.println(queue.first());
      System.out.println(queue.last());

      System.out.println("Length : "+queue.length);
      queue.displayQueue();

      queue.deQueue();
      System.out.println("Length after dequeue the queue : "+queue.length());
      queue.displayQueue();
    }
}
