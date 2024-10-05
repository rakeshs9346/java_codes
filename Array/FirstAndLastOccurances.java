package Array;

public class FirstAndLastOccurances {
    public static void main(String[] args) {
        int[] nums={1,3,3,3,4,5,6};
        int first=firstOccurance(nums, 2);
        if(first==-1){
            System.out.println(first+","+first);
            return;
        }
        int last=lastOccurance(nums, 2);
        System.out.println(first+","+last);
    }
    public static int firstOccurance(int[] arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int first=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                  first=mid;
                  high=mid-1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
     return first;
    }
    public static int lastOccurance(int[] arr,int k){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int last=-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k){
                  last=mid;
                  low=mid+1;
            }else if(arr[mid]<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
     return last;
    }
}
