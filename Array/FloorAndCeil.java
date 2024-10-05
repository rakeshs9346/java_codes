package Array;

public class FloorAndCeil {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        //Floor-largest number <=x in array
        //Ceil-smallest number >=x in array

        int floor=findFloor(arr, 25);
        System.out.println(floor);
        int ceil=findCeil(arr, 25);
        System.out.println(ceil);
    }
    public static int findFloor(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;

        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]<=x){
                ans=arr[mid];
                low=mid+1;  //largest <=x-hence low=mid+1 for any possibility of larger values 
            }else{
                high=mid-1;
            }
        }
        return ans;
    }
    public static int findCeil(int[] arr,int x){
        int n=arr.length;
        int low=0;
        int high=n-1;
        int ans=-1;

        while(low<=high){
            int mid=low+high/2;
            if(arr[mid]>=x){
                ans=arr[mid];
                high=mid-1;  //smallest >=x hence low=mid+1 for any possibility of larger values 
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}
