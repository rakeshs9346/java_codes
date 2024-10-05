package Array;
public class SecondLargest{
    public static void main(String[] args){
           
        int[] arr={9,4,5,7,8,3,2,1,6};

       quickSort(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }

        //finding second largest in sorted array
        int largest=arr[arr.length-1];
        int slargest=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=largest){
             slargest=arr[i];
             break;
            }
        }
        System.out.println(slargest);

        
    }
    public static int secondLargest(int[] arr){
         
        int largest=arr[0];
        int second_Largest=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                second_Largest=largest;
                largest=arr[i];
            }else if(arr[i]<largest && arr[i]>second_Largest){
                second_Largest=arr[i];
            }
        }
        return second_Largest;
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low<high){
            int pidx=partition(arr,low,high);
            quickSort(arr, low, pidx-1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static int partition(int[] arr,int low,int high){
        int pivot=arr[low];
        int i=low;
        int j=high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && i>=low+1){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
}
