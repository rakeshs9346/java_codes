package Array;

public class RightRotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6}; //ans-{5,6,1,2,3,4} where k=2
        int[] newArr=rightRotate(arr, 2);
        for(int num:newArr){
            System.out.print(num+" ");
        }

    }
    public static int[] rightRotate(int[] arr,int k){
         int n=arr.length;
         k=k%n; //if k>length-mode will divide with length and rotate remaining times

         int[] result=new int[n]; //array to store n elements-actual size of array

         for(int i=0;i<n;i++){
            result[(i+k)%n]=arr[i]; //start from k=2 index by leaving 0,1-index it will store at last bcz 2%n=2 i.e n=6,once left side become 6,7 then it will store in 0,1 index

         }
         return result;
    }
}
