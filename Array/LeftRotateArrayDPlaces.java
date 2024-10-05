package Array;
public class LeftRotateArrayDPlaces{
    public static void main(String[] args){
     
        int[] numbers={1,2,3,4,5,6,7};
        // leftRotateArray(numbers, 5);

        leftRotate(numbers, 3);

        for(int num:numbers){
            System.out.print(num+" ");
        }
    }
    
    public static int[] leftRotateArray(int[] arr, int rotateBy) {
        int n = arr.length;

        // If rotateBy is greater than array length, use modulo to get the effective rotation
        rotateBy = rotateBy % n;

        // Create a new array for the rotated elements
        int[] result = new int[n];

        // Left rotate the array
        for (int i = 0; i < n; i++) {
            result[i] = arr[(i + rotateBy) % n];
        }

        return result;
    }
    // using recusion to rotate
    public static void leftRotate(int[] arr,int d){
        int n=arr.length;
        d=d%n;

        reverse(arr, 0 , d-1);//reverse 0 to d-1 elements
        reverse(arr, d, n-1);        //reverse d to n-1 elements
        reverse(arr, 0, n-1);   //reverse total array
    }
    //rotate using recursion
    public static void reverse(int[] arr,int start,int end){
        
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}