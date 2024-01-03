package LinkedList;
/**
 * This is adding the two linklist 
 * 2-->4-->3  && 5-->6-->4
 *  ans : 8-->0-->7
 * 
 * Method 1 : 
 * step1 : reverse both the linkList in order to store the carry 
 * step2 : we have to take the dummy linklist and keep on adding the sum and even the carry 
 */
public class AddTwoLinkedList {
    static Node reverNode(Node head){
        Node perNode=null;
        while(head!=null){
            Node temp=head.next;
            head.next=perNode;
            perNode=head;
            head=temp;
        }
        return perNode;
    }
    public static void main(String[] args) {
        LL.addlast(2);
        LL.addlast(4);
        LL.addlast(3);

        Node head=LL.head;

        LL.head=null;

        LL.addlast(5);
        LL.addlast(6);
        LL.addlast(4);
        Node head1=LL.head;

        head=reverNode(head);
        head1=reverNode(head1);

        Node temp=new Node(-1000);
        Node cur=temp;
        
        int carry=0;
        while(head!=null && head1!=null){
            int sum=head.data+head1.data+carry;
            carry=sum/10;
            sum=sum%10;
            cur.next=new Node(sum);
            cur=cur.next;
            head=head.next;
            head1=head1.next;
        }

        // LL.displayByHead(temp.next);

        temp=reverNode(temp.next);
        LL.displayByHead(temp);

        

    }

}
