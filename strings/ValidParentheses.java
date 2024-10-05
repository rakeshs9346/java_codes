package strings;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="([])";
        System.out.println(isValid(s));
    }
    // public static boolean isValid(String s) {
      Stack<Character> stack=new Stack<>();
        
    //     for(int i=0;i<s.length();i++){
    //         char ch1=s.charAt(i);
    //         if(ch1=='(' || ch1=='{' || ch1=='['){
    //             stack.push(ch1);
    //         }else if(ch1==')' || ch1=='}' || ch1==']'){ 
    //             if(stack.isEmpty() || !matchingPairs(stack.pop(), ch1)){
    //                 return false;
    //             }
    //         }
    //     }

    //     return stack.isEmpty();
    // }
    // public static boolean matchingPairs(char open,char close){
    //     return (open=='(' && close ==')') ||
    //     (open=='{' && close =='}')||
    //     (open=='[' && close ==']');
    // }

    public static boolean isValid(String s){

        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
           s= s.replace("()", "");
            s=s.replace("{}","");
            s=s.replace("[]", "");
        }
        return s.isEmpty();
    }

}
