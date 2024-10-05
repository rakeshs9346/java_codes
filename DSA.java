
public class DSA {
    static class Stack{
        char[] arr;
        int size;
        int top=-1;

        Stack(int size){
            this.size=size;
            arr=new char[size];
        }

        public boolean isEmpty(){
            return top==-1;
        }
        public boolean isFull(){
            return top==size-1;
        }
        public void push(char data){
            if(isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[++top]=data;
        }
        public char pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                
            }
            char val=arr[top--];
            
            return val;
        }
        public char peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
            }
            return arr[top];
        }
    }
  public static void main(String[] args){

    Stack s=new Stack(5);

    String str="abcde";

    char ch[]=str.toCharArray();

    for(int i=0;i<ch.length;i++){
        s.push(ch[i]);
    }

   // System.out.println(s.peek());

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }
  }
    
}
