package LinkedList;

public class addElementInMiddle {
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        LL.addfrist(5);
        Node head=LL.head;
        int num=7;
        Node temp=new Node(num);


        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=slow.next;
        slow.next=temp;
        
        LL.displayByHead(head);
    }
}
