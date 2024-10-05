public class Hanoi {
    
    //time complexity--O(2^n)
    public static void towerOfHanoi(int n,char source,char helper,char destination){
        if(n==1){
            System.out.println("disk "+n+" moved from "+source +" to "+destination);
            return;
        }
        
        towerOfHanoi(n-1, source, destination, helper);
        System.out.println("disk "+n+" moved from "+source+" to "+destination );
        towerOfHanoi(n-1, helper, source, destination);
       }
        public static void main(String[] args){
           int num=4;
           char S='A';
           char H='B';
           char D='C';
           towerOfHanoi(num,S,H,D);
    
        }
    
}
