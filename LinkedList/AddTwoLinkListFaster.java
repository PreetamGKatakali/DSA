package LinkedList;
/**
 * This is adding the two linklist 
 * step1 : we are creating the dummy linklist and while (l1!=null || l2!=null ||carry!=0)
 * step2 : we are taking the digit1 and digit2 from the both linklist
 * step3 : adding the sum of the both linklist with carry 
 * step4 : sum/10 for the carry and sum%10 for the last digit 
 * step5 : creating the new node with the val of the digit 
 * step 6: add the node to the dummy linkedlist
 * step 7: and make sure that both head and head1 is pointing to the next
 * 
 */
public class AddTwoLinkListFaster {
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

        Node dummy=new Node(-1000);  //dummy linklist 
        Node cur=dummy;
        int carry=0;      // we use the carry in the while because if any carry left out 

        while(head!=null || head1!=null || carry!=0){
            int digit1=(head!=null)?head.data:0;
            int digit2=(head1!=null)?head1.data:0;

            int sum=digit1+digit2+carry;
            int digit=sum%10;
            carry=sum/10;

            Node temp=new Node(digit);
            cur.next=temp;
            cur=cur.next;

            head=(head!=null)?head.next:null;
            head1=(head1!=null)?head1.next:null;
        }

        LL.displayByHead(dummy.next);

    }
}
