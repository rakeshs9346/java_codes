package Sorting;
public class MergeSort {
    
    public static void main(String[] args){
           int[] arr={6,5,9,2,3,4,10,11};
           mergeSort(arr,0,arr.length-1);
           for(int num:arr){
            System.out.print(num+" ");
           }
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int mid=low+(high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp=new int[high+1];

        int left=low;
        int right=mid+1;
        int idx=0;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp[idx]=arr[left];
                left++;
                idx++;
            }else{
                temp[idx]=arr[right];
                right++;
                idx++;

            }
        }
        while(left<=mid){
            temp[idx]=arr[left];
            left++;
            idx++;
        }
        while(right<=high){
            temp[idx]=arr[right];
            right++;
            idx++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    
}
