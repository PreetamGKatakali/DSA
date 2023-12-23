package LinkedList;

public class addElement {
    public static Node addElementNode(int val,int pos,Node head){
                Node cur=head;
                Node newNode=new Node(val);
                int count=0;
                if(pos==0){
                    newNode.next=cur;
                    head=newNode;
                    return head;
                }
                while(cur!=null){
                if(count==pos-1){
                    Node temp=cur.next;
                    cur.next=newNode;
                    newNode.next=temp;
                    break;
                }
                // System.out.print(cur.data+" ");
                cur=cur.next;
                count++;
        }
        return head;
    }
    public static int getLength(Node head){
        if(head==null){
            return 0;
        }
        return 1+getLength(head.next);
    }
    public static void main(String[] args) {
        LL.addlast(10);
        LL.addlast(20);
        LL.addlast(30);
        LL.addlast(40);

        int res=getLength(LL.head);
        System.out.println(res);

        // Node head=LL.head;
    

        // // LL.displayByHead(cur);
        // int pos=4;
        // int val=7;
        // LL.displayByHead(addElementNode(val, pos, head));
        

        

        
    }
}
