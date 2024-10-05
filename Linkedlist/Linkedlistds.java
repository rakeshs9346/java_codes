package Linkedlist;
 class Linkedds{
    Node head;
    static int len=0;
      static class Node{
        String str;
        Node next;

        Node(String str){
            this.str=str;
            this.next=null;
            len++;
            
        }
    }
    public void insertFirst(String s){
        Node newNode=new Node(s);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void printList(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node current=head;
        while(current!=null){
            System.out.print(current.str+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void insertLast(String s){
        Node newNode=new Node(s);
        if(head==null){
            head=newNode;
            return;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
        newNode.next=null;
    }
    public void insertPos(int pos,String s){
        Node newNode=new Node(s);
        
        if(pos<=0){
           System.out.println("enter valid position");
           return;
        }
        if(pos==1){
            insertFirst(s);
            return;
        }
        Node temp=head;
        for(int i=2;i<pos;i++){
            if(temp==null){
                System.out.println("out of bounds....");
                return;
            }
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public void delFirst(){
        if(head==null){
          System.out.println("list is empty");
          return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
    }
    public void delLast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node second=head;
        Node first=head.next;
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
           second.next=null;
    }
    public void delPos(int pos){
        if(pos<1){
            System.out.println("enter valid position");
            return;
        }
        if(pos==1){
            delFirst();
        }
        Node second=head;
        Node first=head.next;
        for(int i=2;i<pos;i++){
            second=second.next;
            first=first.next;
        }
        second.next=first.next;

    }
    public void reverseList(){
        if(head==null||head.next==null){
            return;
        }
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;

            //update
            prev=current;
            current=next;
        }
        head=prev;
    }
    public Node reverse(Node node){
        if(head==null || head.next==null){
           return head;
        }
        Node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;
    }
    public int lengthofList(){
        return len;
    }
}

public class Linkedlistds{
    public static void main(String[] args){
        Linkedds list=new Linkedds();
        list.insertFirst("first");
        list.insertFirst("second");
        list.insertFirst("third");
        list.insertLast("last");
        list.insertPos(5, "hello");
        

        list.printList();
        System.out.println(list.lengthofList());
        

    }
}