public class Prac {
    static class Queue{
        int arr[];
        int size;
        int rear=-1;
        int front=-1;

        Queue(int size){
            arr=new int[size];
            this.size=size;
        }
        public boolean isEmpyty(){
            return rear==-1 && front==-1;
        }
        public boolean isFull(){
            return (rear+1)%size==front;
        }
        public void add(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        public int remove(){
            if(isEmpyty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int res=arr[front];
            //single element condition
            if(rear==front){
                rear=front=-1;
            }else{
                front=(front+1)%size;
            }
            
            return res;
        }
        public int peek(){
            if(isEmpyty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
        
    }
    public static void main(String[] args){
        
       Queue queue=new Queue(5);

      queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.add(4);
      queue.add(5);
     
     queue.remove();
     queue.add(6);
     queue.remove();
     queue.remove();

      queue.add(7);

       while(!queue.isEmpyty()){
         System.out.println(queue.peek());
           queue.remove();
       }

     
     
      
    }
}
