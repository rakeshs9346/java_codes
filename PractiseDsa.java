public class PractiseDsa{
    static class Stack{
       static int size;
       static int[] arr;
       static int top=-1;

       public Stack(int size){
          Stack.size=size;
          arr=new int[size];
       }

       public boolean isEmpty(){
        return top==-1;
       }
       public boolean isFull(){
        return top==arr.length;
       }

       public void push(int value){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
          top++;
          arr[top]=value;
       }
       public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        int value=arr[top];
        top--;
        return value;
       }
       public int peek(){
          if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
       }

       public void printStack(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return;
        }
        while(!isEmpty()){
            System.out.println(peek());
            pop();
        }
       }
    }
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        // System.out.println();
        // stack.printStack();

    }
    
}