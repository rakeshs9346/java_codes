package Array;

//Binary Search
public class LowerBound {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,8,10};
        int lbound=lowerBound(arr, 8);
        int ubound=upperBound(arr, 8);
        System.out.println(lbound);
        System.out.println(ubound);
    }
    public static int lowerBound(int[] arr,int target){
        //lower bound is smallest index i.e arr[index]>=target
        int n=arr.length;
        int ans=n;   //we can directly return low instead of using ans variable
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                ans=mid; 
                high=mid-1;  //here we need smallest index hence loop through left side
            }else{
                low=mid+1;
            }
           
        }
        return ans;
    }
    public static int upperBound(int[] arr,int target){
        //upper bound is smallest index i.e arr[index]>target
        int n=arr.length;
        int ans=n;  //we can directly return high instead of using ans variable
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid; 
                high=mid-1;  //here we need smallest index hence loop through left side
            }else{
                low=mid+1;
            }
           
        }
        return ans;
    }
}
