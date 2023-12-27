package LinkedList;

public class RemoveAllElements {
    public static void main(String[] args) {
       LL.addlast(10);
       LL.addlast(20);
       LL.addlast(30);
       LL.addlast(40);
       LL.addlast(20);
       LL.addlast(50);

       Node head=LL.head;

       Node cur=new Node(-1);
       cur.next=head;
       Node temp=cur;
       Node temp1=cur.next;
       while(temp1!=null){
        if(temp1.data==20){
            temp.next=temp1.next;
        }
        else{
            temp=temp.next;
        }
        temp1=temp1.next;
       }

       LL.displayByHead(cur.next);

     



    }
}
