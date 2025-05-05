  
class Linkedlist{
    class Node{
        String data;
        Node next;
    
        public Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    
    public boolean isEmpty(){
       return head==null;
    }
    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }
    public void printList(){
        if(isEmpty()){
           System.out.println("list is empty");
           return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("NULL");

    }
    public String delFirst(){
        if(isEmpty()){
            System.out.println("list is empty");
            return "empty";
        }
        String value=head.data;
        head=head.next;
        return value;
    }
  public String delLast(){
    if(isEmpty()){
        System.out.println("list is empty");
        return "empty list";

    }
    if(head.next==null){
        String value=head.data;
        head=null;
        return value;
    }
    Node prev=head;
    Node first=head.next;

    while(first.next!=null){
        prev=prev.next;
        first=first.next;
    }
    String value=first.data;
    prev.next=null;
    System.out.println(first.data);
    return value;
  }
  public void reverseList(){
    if(isEmpty()){
        System.out.println("list is empty");
        return;
    }
    if(head.next==null){
        return;
    }
    Node prev=null;
    Node current=head;
    Node Next=null;

    while(current!=null){
        Next=current.next;

        //change pointers
        current.next=prev;

        //update prev,curr
        prev=current;
        current=Next;
    }
    head=prev;
  }
}

public class DSA{
    public static void main(String[] args) {
        Linkedlist list=new Linkedlist();
        
        list.addFirst("world");
        list.addFirst("Hello");

        list.addLast("Javascript");
        list.printList();
        System.out.println();
        list.reverseList();
        list.printList();

       
    }
}