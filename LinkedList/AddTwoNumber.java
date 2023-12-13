package LinkedList;
/**
 *  2-->4-->3      3-->6-->7-->2-->5
 *  5-->6-->4      2-->8-->4-->9
 * ___________     _________________
 *  7-->0-->8      5-->4-->2-->2-->6
 * 
 * worst coase 9->9->9->9 + 9->9  ==> 8->9->0->0->1
 * 
 * 
 */
public class AddTwoNumber {
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
        Node list1=LL.head;
        LL.head=null;
        LL.addlast(4);
        LL.addlast(7);
        Node list2=LL.head;
        LL.head=null;

        Node res=new Node(0);
        Node cur=res;
        int carry=0;
        while(list1!=null && list2!=null){
            int sum=list1.data+list2.data+carry;
            carry=sum/10;
            cur.next=new Node(sum%10);
            list1=list1.next;
            list2=list2.next;
            cur=cur.next;
        } 
        while(list1!=null){
            int sum=list1.data+carry;
            carry=sum/10;
            cur.next=new Node(sum%10);
            cur=cur.next;
            list1=list1.next;
        }
        while(list2!=null){
            int sum=list2.data+carry;
            carry=sum/10;
            cur.next=new Node(sum%10);
            cur=cur.next;
            list2=list2.next;
        }
        if(carry>0){
            cur.next=new Node(carry);
            cur=cur.next;
        }

        display(res.next);
    }
}
