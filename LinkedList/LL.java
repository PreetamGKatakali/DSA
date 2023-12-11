package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class LL {
    static Node head;
    static void addfrist(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    static void addlast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    static void delFirst(){
        if(head==null){
            return;
        }
        head=head.next;
    }
    static void delLast(){
        if(head==null){
            return;
        }
        Node FristcurrNode=head;
        
        Node SecoundcurrNode=null;
        while(FristcurrNode.next!=null){
            SecoundcurrNode=FristcurrNode;
            FristcurrNode=FristcurrNode.next;
        }
        SecoundcurrNode.next=null;


    }
    static void display(){
        Node curNode=head;
        while(curNode!=null){
            System.out.print(curNode.data+"-->");
            curNode=curNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        addfrist(10);
        addlast(20);
        display();
    }
}
