class Node{
    String string;
    Node next;
     
    Node(String string){
        this.string=string;
        this.next=null;
    }

}

class LinkedList{
    Node head;

    public boolean isEmpty(){
        return head==null;
    }
    public void addFirst(String string){
        Node newnode=new Node(string);

        if(isEmpty()){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void printList(){
        if(isEmpty()){
            System.out.println("list is empty");
            return;
        }
        Node current=head;
        while(current!=null){
         System.out.println(current.string);
         current=current.next;
        }
    }
}
public class Practise{
    public static void main(String[] args) {
        
        LinkedList list=new LinkedList();
        list.addFirst("hello");
        list.addFirst("world");

        list.printList();
    }
}