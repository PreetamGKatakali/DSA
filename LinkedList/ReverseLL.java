package LinkedList;

public class ReverseLL {
    static void reverseLl(Node head){
        Node  currenthead=head;
        Node pervNode=null;
        while(currenthead!=null){
            Node temp=currenthead.next;
            currenthead.next=pervNode;
            pervNode=currenthead;
            currenthead=temp;
        }

        while(pervNode!=null){
            System.out.print(pervNode.data+"-->");
            pervNode=pervNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.display();
        System.out.println("___________________");
        reverseLl(LL.head);
    }
}
