package Queue;
public class QueueLinkedlist {
    static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value=value;
            next=null;
        }
    }
    static class Queue{
        Node head=null;
        Node tail=null;

        public boolean isEmpyty(){
            return head==null && tail==null;
        }
        public void add(int data){
            Node newNode=new Node(data);
            if(tail==null){
                tail=head=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public int remove(){
            if(isEmpyty()){
                System.out.println("Empty Queue");
                return -1;
            }
            if(head==tail){
                tail=null;
            }
            int front=head.value;
            head=head.next;
            return front;
        }
        public int peek(){
            if(isEmpyty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.value;
        }
    }
    public static void main(String[] args){
        Queue q=new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        // System.out.println(q.peek());

        // while(!q.isEmpyty()){
        //     System.out.print(q.peek()+" ");
        //     q.remove();
        // }

        q.remove();
        q.remove();
        q.remove();
        q.remove();
    }
}
