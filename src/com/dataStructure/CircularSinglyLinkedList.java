package com.dataStructure;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    private class  ListNode{
        private ListNode next;
        private int data;

       public ListNode(int data){
           this.data = data;

       }
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList cll =new CircularSinglyLinkedList();
        cll.createCircularLinkedList();
        cll.display3();

    }
    public  void createCircularLinkedList(){
       ListNode first = new ListNode(3);
       ListNode second = new ListNode(2);
       ListNode third = new ListNode(6);
       ListNode fourth = new ListNode(1);
       first.next=second;
       second.next=third;
       third.next=fourth;
       fourth.next=first;

       last=fourth;
    }
    public void display3(){
        if (last == null) {
           return;
        }
        length=0;
        ListNode node = last.next;
        while(node!=last){
            System.out.print(node.data+" ");
            node= node.next;
            length++;
        }
        length++;
        System.out.println(node.data);
        System.out.println("length : "+length);
    }
}
