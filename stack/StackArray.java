package stack;
public class StackArray{

    static class Stack{
        int size;
        int top=-1;
        int[] arr;

        public Stack(int size){
            this.size=size;
            arr=new int[size];
        }
        public boolean isEmpty(){
            return top==-1;
        }
        public boolean isFull(){
            return top==size-1;
        }
        public void push(int data){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            top++;
            arr[top]=data;
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int temp=arr[top];
            top--;
            return temp;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[top];
        }
    }
    public static void main(String[] args){
       Stack s=new Stack(5);

       s.push(1);
       s.push(2);
       s.push(3);
       s.push(4);
       s.push(5);

    //    while (!s.isEmpty()) {
    //     System.out.println(s.peek());
    //     s.pop();
    //    }
       s.push(6);
    //    while (!s.isEmpty()) {
    //     System.out.println(s.peek());
    //     s.pop();
    //    }
    }
}