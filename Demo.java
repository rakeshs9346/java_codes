import java.util.Stack;

class Dbll{
     Node head;
     Node tail;
    static class Node{
        int data;
        Node next;
        Node prev;
    
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    
   public Dbll(){
    
        this.head=null;
        this.tail=null;
    }

    public void addFirst(int data){
        Node newNode=new Node(data);

        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void addTail(int data){
        Node newnNode=new Node(data);

        if(head==null){
            head=tail=newnNode;
            return;
        }
        
        tail.next=newnNode;
        newnNode.prev=tail;
        tail=newnNode;
        
    }
    public void deleteHead(){
        if(head==null || head ==tail){
            head=tail=null;
            return;
        }
        head=head.next;
        head.prev=null;
        
    }
    public void deleteTail(){
        if(head==null || head ==tail){
            head=tail=null;
            return;
        }
        tail=tail.prev;
        tail.next=null;

    }
    public void reverseDbll(){
        if(head==null || head.next==null){
            System.out.println(head.data);
            return;
        }
        Stack<Integer> stack=new Stack<>();

        Node current=head;
        while(current!=null){
            stack.push(current.data);
            current=current.next;
        }

        Node temp=head;
        while(!stack.empty()){
            temp.data=stack.peek();
            stack.pop();
            temp=temp.next;
        }
    }
    public void printForward(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        
        Node current=head;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println();
    }
    public void printBackward(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node current=tail;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.prev;
        }
        System.out.println();
    }
}
public class Demo {
    public static void main(String[] args) {
         Dbll ll=new Dbll();

         ll.addTail(43);
         ll.addTail(132);
         ll.addFirst(34);
         ll.addTail(44);
          ll.printForward();
          ll.reverseDbll();
          ll.printForward();
        // ll.printBackward();
       


    }
}
