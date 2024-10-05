package stack;
import java.util.ArrayList;
public class StackArrayList {
    static class Stack{
        ArrayList<Integer> list=new ArrayList<>();

        public boolean isEmpty(){
            return list.size()==0;
        }
        public void push(int value){
            list.add(value);
        }
        public int pop(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("stack is empty");
                return -1;
            }
            return list.get(list.size()-1);
        }
        public void pushAtBottom(Stack s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtBottom(s, data);
            s.push(top);
        }
        public void reverse(Stack s){
            if(isEmpty()){
                return;
            }
            int top=s.pop();
            reverse(s);
            pushAtBottom(s, top);
        }
    }
    public static void main(String[] args){
       
        Stack s=new Stack();
        s.push(6);
        s.push(7);
        s.push(8);
       
        // s.pop();
        // s.pop();
        // s.pop();

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
        
    }
}
