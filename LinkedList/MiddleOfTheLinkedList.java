package LinkedList;
/**
 * finding the middle element in the linkedList 
 * i.e-> here we can taking the fast and slow 
 * where fast traves the linked list in the 2x speed 
 * and slow traves the linkedlist in the 1x speed 
 */
public class MiddleOfTheLinkedList {

    static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(5);
        LL.addlast(6);
        LL.addlast(7);

        Node slow=LL.head;
        Node fast=LL.head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        display(slow);


        // int length=0;
        // Node currenthead=LL.head;
        // while(currenthead!=null){
        //     System.out.print(currenthead.data+"-->");
        //     currenthead=currenthead.next;
        //     length++;
        // }
        // System.out.println("null");
        // length=length/2;

        // int count=0;
        // Node reshead=LL.head;
        // while(reshead!=null){
        //     if(count<2){
        //         reshead=reshead.next;
        //         count++;
        //     }
        //     else{
        //         System.out.print(reshead.data+"-->");
        //         reshead=reshead.next;
        //     }
        // }
        // System.out.println("null");
    }
}
