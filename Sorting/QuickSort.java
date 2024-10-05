package Sorting;
 public class QuickSort{
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[j];
        arr[j]=temp;
        return j;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pidx=partition(arr, low, high);

            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args){
           
        int[] arr={6,3,9,5,2,8,2};

        quickSort(arr, 0, arr.length-1);

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}