package Queue;

public class QueueArray{
    static class Queue{
        int size;
        int[] arr;
        int rear=-1;

        public Queue(int size){
            this.size=size;
            arr=new int[size];
        }
        public boolean isEmpyty(){
            return rear==-1;
        }
        public boolean isFull(){
            return rear==size-1;
        }
        public void add(int value){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=value;
        }
        public int remove(){
            if(isEmpyty()){
                System.out.println("queue is empty");
                return -1;
            }
             int front=arr[0];
             
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;

        }
        public int peek(){
            if(isEmpyty()){
                System.out.println("Empty queue");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args){

          Queue q=new Queue(5);

          q.add(1);
          q.add(2);
        //   q.add(3);
        //   q.add(4);
        //   q.add(5);

        //   q.add(6);
        //   while(!q.isEmpyty()){
        //     System.out.print(q.peek()+" ");
        //     q.remove();
        //   }

        q.remove();
        q.remove();
        q.remove();
    }       
}