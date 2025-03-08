import java.util.HashMap;
import java.util.Map;

public class PractiseDsa { 
    public static void main(String[] args){
   
    //    int arr[]={1,2,3,4,1,2,2,3,4,4,1,5,3};
    //    Map<Integer,Integer> map=new HashMap<>();

    //    for(int num:arr){
    //     map.put(num, map.getOrDefault(num, 0)+1);
    //    }

    //    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
    //     System.out.println(entry.getKey()+" "+entry.getValue());
    //    }


        int a=2;
        int n=4;
        int d=2;
        int output=0;
       
        for(int i=1;i<=n;i++){
           output+=a;
           a=a+d;
        }
        System.out.println(output);
    }
    
}
