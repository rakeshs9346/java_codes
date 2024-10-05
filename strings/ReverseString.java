package strings;

public class ReverseString{
    public static void main(String[] args){
         String words="a good  example";
      
      String s=reverseWords(words);
      System.out.println(s);
    }
    public static String reverseWords(String s) {
        
          s=s.trim();

          StringBuilder sb=new StringBuilder();

          String[] str=s.split("[ ,  ]+");

          for(int i=str.length-1;i>=0;i--){
            sb.append(str[i]);
            sb.append(" ");
          }
          
          return sb.toString().trim();
    }
}