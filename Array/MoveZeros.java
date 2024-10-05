package Array;

public class MoveZeros {
  public static void main(String[] args) {
    int[] arr={1,0,2,3,2,0,0,4,0,5,1};  
    moveZerosToEnd(arr);
    
    for(int num:arr){
     System.out.print(num+" ");
    }

  }
  public static void moveZerosToEnd(int[] arr){
    int i=-1;

    for(int j=0;j<arr.length;j++){  //to find the first zero
       if(arr[j]==0){
        i=j;
        break;
       }
    }
    for(int j=i+1;j<arr.length;j++){  //swapping each non-zero with zero and increase index of zero by 1 after swapping
        if(arr[j]!=0){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
        }
    }
}   
}
