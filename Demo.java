class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class CLL{
    static Node head;
    static Node tail;

    public boolean isEmpty(){
        return (head==null && tail ==null);
    }

    public void insert(int data){
        Node newNode=new Node(data);

        if(isEmpty()){
            head=tail=newNode;
            newNode.next=newNode;
        }

        newNode.next=head;
        tail.next=newNode;
        head=newNode;
    }

    public void printList(){
        if(isEmpty()){
            System.out.println("List is empty..");
            return;
        }

        Node temp=tail.next;

        while(true){
            System.out.print(temp.data+"->");
            temp=temp.next;
            if(temp==tail.next){
                break;
            }
        }
        System.out.println();

        
    }
}

public class Demo{
    public static void main(String[] args) {
        CLL list=new CLL();
        
        list.insert(2);
        list.insert(1);
        

        list.printList();
    }
}