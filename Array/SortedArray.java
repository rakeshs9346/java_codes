package Array;

public class SortedArray {
    public static void main(String[] args){
          
        int[] nums={4,5,5,6,8,6,9,1,2,1};
        // boolean sorted=isArraySorted(nums);
        // System.out.println(sorted);
        removeDuplicates(nums);
        for(int num:nums){
            System.out.print(num+" ");
        }

    }
    
    public static boolean isArraySorted(int[] arr){

        int n=arr.length;
        
        //logic-1
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
              return false;
            }
        }
        return true;

        // logic-2
        // for(int i=1;i<n;i++){
        //     if(arr[i]>=arr[i-1]){

        //     }else{
        //         return false;
        //     }
        //     return true;
        // }
    }
    //for sorted arrays
    public static void removeDuplicates(int[] arr){
        //logic-1
        // Set<Integer> set=new HashSet<>();

        // for(int i=0;i<arr.length;i++){
        //     set.add(arr[i]);
        // }
        // System.out.println(set);

        //two pointer approach-for sorted array

         int i=0;
        for(int j=1;j<arr.length;j++){
           if(arr[i]!=arr[j]){
            arr[i+1]=arr[j];
            i++;
           }
        }
        // return i+1;
    }
    
}
