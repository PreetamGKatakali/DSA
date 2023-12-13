package LinkedList;
/**
 * this is sorting in the linkedlist
 */
public class InsertionSortLL {
    public static void main(String[] args) {
        LL.addlast(-1);
        LL.addlast(5);
        LL.addlast(3);
        LL.addlast(4);
        LL.addlast(0);
        Node cur=LL.head;
        Node res=new Node(-1000);   //[-1000,-1,5]
        while(cur!=null){
            Node temp=cur.next;  //4
            Node perv=res;
            Node nxt=res.next;
            while(nxt!=null){
                if(nxt.data>cur.data){
                    break;
                }
                perv=nxt;
                nxt=nxt.next;
            }
            cur.next=nxt;
            perv.next=cur;
            cur=temp;
        }


        Node result=res.next;
        while(result!=null){
            System.out.print(result.data+"-->");
            result=result.next;
        }
        System.out.print("null");
        

    }
}
