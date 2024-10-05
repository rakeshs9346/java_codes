package Array;

public class BinarySearch {
    public static void main(String[] args) {
     
        int[] arr={1,2,3,4,5,6,8};
        int val=binarySearch(arr, 0, arr.length-1, 6);
        System.out.println(val);
        
        
    }
    public static int binarySearch(int[] arr,int low,int high,int target){
        if(low>high){
            return -1;
        }
        
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                return binarySearch(arr,mid+1,high ,target);
            }
                return binarySearch(arr, low, mid-1, target);
            
        }
        return -1;

    }
    public static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }
    
}
