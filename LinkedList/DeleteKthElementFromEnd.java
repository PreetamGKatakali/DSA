package LinkedList;

public class DeleteKthElementFromEnd {
    public static void main(String[] args) {
        LL.addlast(1);  //1-->2-->3-->4-->5-->null
        LL.addlast(2);
        LL.addlast(3);
        LL.addlast(4);
        LL.addlast(5);
        Node head=LL.head;
        int k=3;
        Node cur=head;
        int len=0;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        int pos=1;
        Node temp=head;
        while(temp!=null){
            if(pos==(len-k)){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
            pos++;
        }

        Node point=head;
        while(point!=null){
            System.out.print(point.data+"-->");
            point=point.next;
        }
        System.out.println("null");
        


    }
}
