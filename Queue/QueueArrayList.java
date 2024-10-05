package Queue;
import java.util.ArrayList;
public class QueueArrayList {
    static class Queue{
      ArrayList<Integer> list=new ArrayList<>();

      public boolean isEmpty(){
        return list.size()==0;
      }
      public void add(int value){
        list.add(value);
      }
      public int remove(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        int front=list.getFirst();
        list.remove(list.getFirst());
        return front;
      }
      public int peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return list.getFirst();
      }
    }
    public static void main(String[] args){
         
        Queue q=new Queue();

        q.add(1);
        q.add(2);
        q.add(4);

    //   while(!q.isEmpty()){
    //     System.out.print(q.peek()+" ");
    //     q.remove();
    //   }

    q.remove();
    q.remove();
    q.remove();
    q.remove(); //queue is empty here
    }
    
}
