package Queue;
public class CircularQueueArray {
    static class Queue{
        int size;
        int arr[];
        int front=-1;
        int rear=-1;

        public Queue(int size){
            this.size=size;
            arr=new int[size];
        }
        public boolean isEmpyty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add(int value){
            if(isFull()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=value;
            
        }
        public int remove(){
            if(isEmpyty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                front=rear=-1;
            }else{
                front=(front+1)%size;
            }
            return result;
        }
        public int peek(){
            if(isEmpyty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args){
          Queue q=new Queue(3);

          q.add(20);
          q.add(30);
          q.add(40);
        //   q.add(50);
        //   q.add(60);
        
        //   System.out.println(q.peek());

        // while(!q.isEmpyty()){
        //     System.out.print(q.peek()+" ");
        //     q.remove();
        // }

        q.remove();
        q.remove();
        q.remove();
        // q.remove();
    }
    
}
