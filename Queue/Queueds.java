package Queue;
public class Queueds {
      static class Queue{
         int arr[];
         int size;
         int rear=-1;

        Queue(int n){
            arr=new int[n];
            this.size=n;
        }
        public  boolean isEmpyty(){
            return rear==-1;
        }
        public boolean isfull(){
            return rear==size-1;
        }
        public  void add(int value){
            if(isfull()){
                System.out.println("full queue");
                return;
            }
            rear++;
            arr[rear]=value;
        }
        public  int remove(){
            if(isEmpyty()){
                System.out.println("empty queue");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear--;
            return front;
        }
        public  int peek(){
            if(isEmpyty()){
                return -1;
            }
            return arr[0];
        }
    
    }   
    public static void main(String[] args){
        Queue q=new Queue(5);

         q.add(5);
        q.add(4);
        q.add(3);
        q.add(2);
        q.add(1);

        while(!q.isEmpyty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }

    }

}
