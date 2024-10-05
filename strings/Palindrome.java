package strings;

public class Palindrome {
    public static void main(String[] args){        
             String str= "A man, a plan!, a canal:, Panama";
             System.out.println(isPalindrome(str));
      }
      //palindrome using two pointers
      public static boolean isPalindrome(String s) {
         String s1=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
     
         int left=0;
         int right=s1.length()-1;
     
         while(left<right){
           char ch=s1.charAt(left);
           if(ch!=s1.charAt(right)){
             return false;
           }else{
             left++;
           right--;
           }
     
         }
         return true;
     
     }
}
