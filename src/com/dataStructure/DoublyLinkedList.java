package com.dataStructure;

public class DoublyLinkedList {
    private ListNode head;
    private  ListNode tail;

    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.head=new ListNode(2);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        dll.tail =new ListNode(3);

        dll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = dll.tail;

        dll.tail.previous=fourth;
        fourth.previous=third;
        third.previous=second;
        second.previous=dll.head;

        dll.display2();


    }
    int count=0;
    public void display2(){
        ListNode node = head;
        while(node!=null){
            System.out.print(node.data);
            if(node.next!=null) {
                System.out.print(",");
            }
            node=node.next;
            count++;
        }
        System.out.println();
        System.out.println("Length : "+count);
    }
}
