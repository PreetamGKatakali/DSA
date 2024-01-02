package LinkedList;

import java.util.LinkedList;
/**
 * This is finding weather the cycle is found in the LinkedList or not 
 * 
 * here frist we are adding the linkedlist and making the list tail to point the head agian 
 * i.e --> head.next.next.next.next=LL.head;  (based on the number of elements)
 */
public class CycleLinkList {
    static boolean findCycle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        Node head=LL.head;

        head.next.next.next.next=LL.head;

        System.out.println(findCycle(head));

       


        

        

    }
}
