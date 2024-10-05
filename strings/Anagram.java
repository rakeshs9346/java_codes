package strings;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String s="silent";
        String s1="listen";

        boolean b=isAnagram(s,s1);
        System.out.println(b);
    }
    public static boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

       return Arrays.equals(ch1,ch2);
       
   }

}
