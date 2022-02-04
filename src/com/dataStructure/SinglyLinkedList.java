package com.dataStructure;

public class SinglyLinkedList {
    private ListNode head;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ListNode fifth =new ListNode(3);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
       /*
        sll.insertFirst(3);
        sll.insertLast(7);
        sll.insert(9, 1);
        System.out.println(sll.deleteFirst().data);
        System.out.println(sll.deleteLast().data);
        System.out.println(sll.delete(4).data);
        */

        sll.display();

        /*
        if(sll.loop()==true){
            System.out.println("Loop  detected.");
        }else {
            System.out.println("loop not detected");
        }
        sll.loop1();

        sll.findData(1);
        sll.middleNode();
        sll.reverse();
        if(sll.search(8)==true){
            System.out.println("Search value found!!... ");
        }else{
            System.out.println("Search not found!!!..");
        }
    */
    }

    int count = 0;

    public void display() {
        ListNode node = head;
        while (node != null) {
            System.out.print(node.data + ",");
            node = node.next;
            count++;
        }
        System.out.println("null");
        System.out.println("length:" + count);
    }
   /*
 //detecting loop in singlyLinkedList
    public Boolean loop(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer!=null&&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer= slowPointer.next;
            if(fastPointer==slowPointer){
               //return removeLoop();
               return true;
            }
        }
        return false;
    }

    //get stratingPoint of loop
    public ListNode loop1(){
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer!=null&&fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            slowPointer= slowPointer.next;
            if(fastPointer==slowPointer){
                return getStartingNode(slowPointer);
            }
        }
        return null;
    }
    public ListNode getStartingNode(ListNode slowPointer){
        ListNode temp=head;
        while(slowPointer!=temp){
            temp = temp.next;
            slowPointer= slowPointer.next;
        }
        return temp;
    }

   // remove loop

     public void removeLoop(){
         ListNode temp=head;
         while(slowPointer.next!=temp.next){
             temp = temp.next;
             slowPointer= slowPointer.next;
         }
         slowPointer.next=null;
     }

*/





    /*
    //find node at specific point
    public void findData(int position){
        if(head==null){
            System.out.println("There is no singlyLinkedList.");
        }
        if(position<=0){
            throw new IllegalArgumentException("Invalid value: position "+position);
        }

        else if (position<=count){
            ListNode node=head;
            int i=1;
            while(i<=count){
                if(i==position){
                    System.out.println(node.data);
                    break;
                }
                node=node.next;
                i++;
            }
        }
        else{
            System.out.println("position number is greater than singlyLinkedList size. ");
        }
    }

 public void middleNode(){{
 }
     int temp=1;
     ListNode node=head;
     while(temp<(count/2)+1) {
         node = node.next;
         temp++;
     }
     if(temp==(count/2)+1){
        System.out.println(node.data);

    }
 }

 //reverse singlyLinkedList
 public void reverse(){
     if(head==null){
         System.out.println("null");
     }else if(head.next==null){
         System.out.println(head.data);
     }else{
         ListNode currentNode = head.next;
         head.next=null;
         ListNode node=head;

         while(currentNode.next!=null){
             head=currentNode;
             currentNode=currentNode.next;
             head.next=node;
             node=head;
         }
         head=currentNode;
         head.next=node;
         node=head;
         while(node!=null){
             System.out.print(node.data);

             if(node.next!=null){
                 System.out.print(",");
             }
             node=node.next;
         }
     }
 }


 /*
 //Search an element
 public Boolean search(int value){
     if(head==null){
         return false;
     }
     else{
         ListNode node = head;
         while(node!=null){
           if(node.data==value){
               return true;
           }
           node=node.next;
         }
         return false;
     }
 }

 //by this we can insert node at the first of the SinglyLinkedList
 // by this we can  also creat singlyLinkedList backward direction
 public void insertFirst(int value) {
     ListNode newNode = new ListNode(value);
     newNode.next = head;
     head = newNode;
 }

 //by this we can add node at the end of the SinglyLinkedList
 public void insertLast(int value) {
     ListNode newNode = new ListNode(value);
     if (head == null) {
         head = newNode;
     } else {
         ListNode node = head;
         while (node.next != null) {
             node = node.next;
         }
         node.next = newNode;
     }

 }

 //insert node at a given position
 public void insert(int value, int position) {
     ListNode newNode = new ListNode(value);
     if (position == 1) {
         newNode.next = head;
         head = newNode;
     } else {
         ListNode node = head;
         count = 1;
         while (count < position - 1) {
             node = node.next;
             count++;
         }
         newNode.next = node.next;
         node.next = newNode;
     }
 }

 //delete first node
 public ListNode deleteFirst() {
     ListNode node = head;
     if (head == null) {
         return null;
     } else {
         head = node.next;
         return node;
     }
 }
  //delete last node
 public ListNode deleteLast() {
     if (head == null || head.next == null) {
         return head;
     }
     ListNode node = head;
     ListNode previousNode = null;
     while (node.next != null) {
         previousNode = node;
         node = node.next;
     }
     previousNode.next = null;
     return node;
 }
 // delete element at given position
 public ListNode delete(int position){

     if(position==1){
         ListNode node =head;
         head=head.next;
         return node;
     }
         count=1;
         ListNode previousNode=null;
         ListNode node=head;
         while(count<position){
             previousNode=node;
             node=node.next;
             count++;
         }
         previousNode.next=node.next;
         return node;
 }

*/
}
