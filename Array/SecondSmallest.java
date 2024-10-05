package Array;
public class SecondSmallest {
    public static void main(String[] args){
        int[] arr={4,3,8,9,10,54,2,11,5,8,9,32};
        
        int val=secondSmallest(arr);
        System.out.println(val);

    }
    public static int secondSmallest(int[] arr){
        int smallest=arr[0];
        int second_Smallest=Integer.MAX_VALUE;
        //loop through array
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                //arr[i] is smallest threfore assign smallest value to second smallest
                second_Smallest=smallest;
                smallest=arr[i];
            }else if(arr[i]>smallest && arr[i]<second_Smallest){
                second_Smallest=arr[i];
            }
        }
        return second_Smallest;
    }
}
