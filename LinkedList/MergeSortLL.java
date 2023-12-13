package LinkedList;

/**
 * mergeing the two linked list to sorted LL
 */
public class MergeSortLL {
    public static void main(String[] args) {
        LL.addlast(1);
        LL.addlast(4);
        LL.addlast(5);
        LL.addlast(7);
        Node list1=LL.head;
        LL.head=null;
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(6);
        Node list2=LL.head;

        Node res=new Node(-1);
        Node cur=res;
        while(list1!=null && list2!=null){
            if(list1.data < list2.data){
                cur.next=list1;
                list1=list1.next;
                cur=cur.next;
            }
            else{
                cur.next=list2;
                list2=list2.next;
                cur=cur.next;
            }
        }
        if(list1!=null){
            cur.next=list1;
        }
        if(list2!=null){
            cur.next=list2;
        }
        Node temp=res.next;
        while (temp!=null) {
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");

        
        
        
    }
}
