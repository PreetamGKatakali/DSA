package LinkedList;
/**
 * Adding the element in the middle of the linked list 
 * There is also condistion of the even length of the linked list and 
 * evem the odd linked lists
 */
public class AddInTheMiddle {
    public static int getCount(Node head){
        if(head==null){
            return 0;
        }
        return 1+getCount(head.next);
    }
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(2);
        LL.addlast(4);
        LL.addlast(5);
        LL.addlast(6);
        LL.addlast(8);
 

        Node head=LL.head;

        Node newNode=new Node(7);

        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // newNode.next=slow.next;
        // slow.next=newNode;
        if(getCount(head)%2==0){
            newNode.next=slow;
            slow=newNode;
        }
        else{
            newNode.next=slow.next;
            slow.next=newNode;
        }


        LL.displayByHead(slow);

        


        

    }
}
