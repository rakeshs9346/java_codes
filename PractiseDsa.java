import java.util.Stack;

public class PractiseDsa {
    public static void reverseArray(int[] arr){
         for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--){
            int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
         }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }

    public static void revArray(int[] arr,int start,int end){
        if(start>=end){
            return;
        }else{
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;  
        }
        revArray(arr, start+1, end-1);


        

    }
    public static void revArrStack(int[] arr){
        Stack<Integer> s=new Stack<>();

        for(int i=0;i<arr.length;i++){
            s.push(arr[i]);
        }
        while(!s.isEmpty()){
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }

    public static void insertionSort(int[] arr){
       
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;

            while(j>=0 && current<arr[j]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j--;
            }
            
        }
    }
    public static void binarySearch(int[] arr,int target){

        int start=0;
        int end=arr.length-1;

        for(int i=0;i<arr.length;i++){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                 System.out.println(mid);
                 return;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
    }
    public static void main(String[] args){
   
          int[] nums={4,5,3,2,1,6};
          int[] arr={1,2,3,4,5};

          binarySearch(arr, 4);

        // revArray(nums,0,4);

        // for(int n:nums){
        //     System.out.print(n+" ");
        // }

       // revArrStack(nums);

       //bubbleSort(nums);

       //selectionSort(nums);

    //    insertionSort(nums);
    //    for(int n:nums){
    //     System.out.print(n+" ");
    //    }

       int minValue=nums[0];

       for(int i=1;i<nums.length;i++){
        if(nums[i]<minValue){
            minValue=nums[i];
        }
       }
        
      // System.out.println(minValue);



        
    }
    
}
