package Array;

public class RotateArray {
    public static void main(String[] args){
 
         int[] nums={1,2,3,4,5};

         rotateOnePlace(nums);

    }
    public static void rotateOnePlace(int[] arr){
        //Approach-1
        for(int i=0;i<arr.length-1;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        //Appraoch-2

        // int temp=arr[0];
        // for(int i=1;i<arr.length;i++){
        //     arr[i-1]=arr[i];
        // }
        // arr[arr.length-1]=temp;
        
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
