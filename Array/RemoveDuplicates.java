package Array;
import java.util.*;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr1={1,1,2,2,2,3,3};
        int[] nums={2,3,4,3,2,5,6,5};
        //removeDuplicates(nums);
          
        // int[] arr=Arrays.stream(nums).distinct().toArray();  //using built-in methods to remove duplicates
        // System.out.println(arr);


        removeDuplicates1(arr1);
        for(int n:arr1){
            System.out.print(n+",");
        }
        
    }
     //removing duplicates from sorted array-
     public static void removeDuplicates1(int[] arr){
        //two pointer approach
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        
     }

    //removing Duplicates from unsorted and sorted array
    public static void removeDuplicates2(int[] arr){

         Map<Integer,Boolean> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
           if(map.containsKey(arr[i])){

           }else{
            map.put(arr[i], true);
           }
        }
        for(Integer num:map.keySet()){
            System.out.print(num+" ");
        }
    }
}
