package stack;

public class StackLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int value){
            this.data=value;
            next=null;
        }
    }
    static class Stack{
        Node head;

        public boolean isEmpty(){
            return head==null;
        }
        public void push(int value){
            Node newNode=new Node(value);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
       
         Stack s=new Stack();

         s.push(1);
         s.push(2);
         s.push(3);
         s.push(4);
 
        //  while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        //  }
    
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}
