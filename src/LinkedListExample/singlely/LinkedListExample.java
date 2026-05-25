package LinkedListExample.singlely;

import java.util.LinkedList;

class Node {
    int data;
    Node next;
    Node(int head,Node next){
        this.data=head;
        this.next=next;
    }
    Node(int head){
        this.data=head;
        this.next=null;
    }
}
public class LinkedListExample {
    public static Node Listconvertion(int[] arr) {
        if(arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }

    public static void printList(Node head) {

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
   public static Node deleteAtfirst(Node head){
       if(head==null){
           return head;
       }
        head=head.next;
        return head;
   }
    public static Node deleteAtLast(Node head){
        if(head==null){
            return head;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }
    public static Node deleteAtPosition(Node head,int pos){
        if(head==null){
            return head;
        }
        if(pos==1) {
        return deleteAtfirst(head);
        }
        int c=1;
        Node prev=head;
        Node temp=head.next;
        while(prev.next!=null){
            c++;
            if (c == pos) {
                prev.next=temp.next;
                temp.next=null;
                return head;
            }
            prev=prev.next;
            temp=temp.next;
        }
return head;
    }
    public static Node insertAtFirst(Node head,int val){
        if(head==null){
            return new Node(val);
        }
        Node temp=new Node(val);
        temp.next=head;
        return temp;
    }
    public static Node insertAtLast(Node head,int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next=new Node(val);
        return head;
    }
    public static Node insertAtPosition(Node head,int val,int pos) {
        if(pos==1){
            return insertAtFirst(head,val);
        }
        int c=1;
        Node prev=head;
        Node temp=head.next;
        while(prev.next!=null){
            c++;
            if (c == pos) {
                prev.next=new Node(val,temp);
                return head;
            }
            prev=prev.next;
            temp=temp.next;
        }
        return head;
    }
    public static Node deleteAValue(Node head,int val){
        //we cannot delete head here.
        if(head==null){
            return head;
        }

        Node prev=head;
        Node temp=head.next;
        while(temp!=null){
            if (temp.data == val) {
                prev.next=temp.next;
                temp.next=null;
                return head;
            }
            prev=prev.next;
            temp=temp.next;
        }
        return head;
    }
    public static Node insertBeforeValue(Node head,int val,int posval){
    if(head==null){
        return new Node(val);
    }
    if(head.data==posval){
        return head=new Node(val,head);
    }
    Node prev = head;
    Node temp=head.next;

    while(temp!=null){
        if(temp.data==posval){
            prev.next=new Node(val,temp);
            return head;
        }
        prev=prev.next;
        temp=temp.next;
    }
    return head;
    }
    public static Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }


    public static Node sortList(Node head) {
        if(head==null || head.next==null){
            return head;
        }
        Node middle=findMiddle(head);
        Node right=middle.next;
        middle.next=null;
        Node leftsort=sortList(head);
        Node rightsort=sortList(right);
        return merge(leftsort,rightsort);
    }
    public static Node findMiddle(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node merge(Node left,Node right){
        Node dummy=new Node(-1);
        Node temp=dummy;
        Node h1=left;
        Node h2=right;
        while(h1!=null&&h2!=null)
        {
            if(h1.data<h2.data){
                temp.next=h1;
                temp=h1;
                h1=h1.next;
            }else{
                temp.next=h2;
                temp=h2;
                h2=h2.next;
            }
        }
        if(h1==null){
            temp.next=h2;
        }else{
            temp.next=h1;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        int[] arr={1,2,5,4,3};
        Node head=Listconvertion(arr);
        head=reverseList(head);
        head=sortList(head);
        printList(head);
    }
}
