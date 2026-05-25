package LinkedListExample.doubly;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DDL {
    private static Node convert2DLL(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            temp.prev = mover;
            mover = temp;
        }
        return head;
    }

    private static void print2DLL(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    private static Node deleteAtfirst(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }

    private static Node deleteAtLast(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node pre = tail.prev;
        pre.next = null;
        tail.prev = null;
        return head;
    }

    private static Node deleteAtPosition(Node head, int pos) {
        if (head == null || head.next == null) {
            return null;
        }
        if (pos == 1) {
            return deleteAtfirst(head);
        }
        int c = 1;
        Node temp = head;
        while (temp != null) {
            if (c == pos) {
                Node pre = temp.prev;
                Node nex = temp.next;

                if (pre != null) pre.next = nex;
                if (nex != null) nex.prev = pre;
                temp.next = null;
                temp.prev = null;
                break;
            }
            c++;
            temp = temp.next;
        }
        return head;
    }

    private static Node deleteAValue(Node head, int val) {
        if (head == null || head.next == null) {
            return null;
        }
        if (head.data == val) {
            return deleteAtfirst(head);
        }
        Node temp = head.next;
        while (temp != null) {
            if (temp.data == val) {
                Node pre = temp.prev;
                Node nex = temp.next;

                if (pre != null) pre.next = nex;
                if (nex != null) nex.prev = pre;
                temp.next = null;
                temp.prev = null;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    private static Node insertAtFirst(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        return new Node(val, head, null);

    }

    private static Node insertAtLast(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(val, null, temp);
        temp.next = newNode;
        return head;
    }
    private static Node insertAtPosition(Node head, int val, int pos) {
        if (head == null) {
            return new Node(val);
        }
        if(pos==1){
            return insertAtFirst(head,val);
        }
        Node temp = head;
        int c=1;
        while(temp!=null){
            if(pos==c){
                Node pre=temp.prev;
                pre.next=new Node(val,temp,pre);
                temp.prev=pre.next;
                return head;
            }
            c++;
            temp=temp.next;
        }
        return insertAtLast(head, val);
    }
    private static Node insertBeforeAValue(Node head, int val, int posVal) {
        if (head == null) {
            return new Node(val);
        }
        if(head.data==posVal){
            return insertAtFirst(head,val);
        }
        Node temp = head;
        while(temp!=null){
            if(temp.data==posVal){
                Node pre=temp.prev;
                pre.next=new Node(val,temp,pre);
                temp.prev=pre.next;
                return head;
            }
            temp=temp.next;
        }
        return insertAtLast(head, val);
    }
    private static Node reverse2DLL(Node head){
        Node pre=null;
        Node curr=head;
        while(curr!=null){
            pre=curr.prev;
            curr.prev=curr.next;
            curr.next=pre;
            curr=curr.prev;
        }
        return pre.prev;
    }


    public static void main(String[] args) {
    int[] arr={1,2,3,4};
    Node head=convert2DLL(arr);
    head=reverse2DLL(head);
    print2DLL(head);
    }
}

