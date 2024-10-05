
public class Sample{
   
  public static void main(String[] args) {   
      
      int[] arr1={101,44,65,1,7,3,5,6,9,13,34,45,90};
      int[] arr2={1,1,2,2,2,3,3};
      int[] arr3={1,2,3,4,5}; //to left rotate array
       
      // leftRotate(arr3, 2);
      leftRotateOnePlace(arr3, 1);
      for(int num:arr3){
        System.out.print(num+" ");
      }

      // removeDuplicates(arr2);
      // for(int num:arr2){
      //   System.out.print(num+" ");
      // }
     // bubbleSort(arr1);
      // insertionSort(arr1);

      // for(int n:arr1){
      //   System.out.print(n+" ");
      // }
    //  System.out.println();
    //  System.out.println(secondLargest(arr1));
    //  System.out.println();
    //  System.out.println(secondSmallest(arr1));

}
public static void leftRotate(int[] arr,int k){
      int n=arr.length;
      k=k%n;

      int[] temp=new int[n];

      for(int i=0;i<n;i++){
        temp[i]=arr[(k+i)%n];
      }
      for(int num:temp){
        System.out.print(num+" ");
      }
}
public static void removeDuplicates(int[] nums){

  //two pointer approach

  int i=0;
  for(int j=1;j<nums.length;j++){
    if(nums[j]!=nums[i]){
        nums[i+1]=nums[j];
        i++;
    }
  }
}
public static void leftRotateOnePlace(int[] arr,int k){
    int n=arr.length;
    k=k%n;

    int temp=arr[0];
    for(int i=0;i<n-1;i++){
      arr[i]=arr[i+1];
    }
    arr[n-1]=temp;
}
public static int secondSmallest(int[] arr){
  int smallest=arr[0];
  int sec_smallest=Integer.MAX_VALUE;

  for(int i=1;i<arr.length;i++){
    if(smallest>arr[i]){
      sec_smallest=smallest;
      smallest=arr[i];
    }else if(arr[i]>smallest && arr[i]<sec_smallest){
      sec_smallest=arr[i];
    }
  }
  return sec_smallest;
}
public static int secondLargest(int[] arr){

  int largest=arr[0];
  int sec_largest=Integer.MIN_VALUE;

  for(int i=1;i<arr.length;i++){
    if(arr[i]>largest){
      sec_largest=largest;
      largest=arr[i];
    }else if(arr[i]<largest && arr[i]>sec_largest){
      sec_largest=arr[i];
    }
  } 
  return sec_largest;
}
  public static void bubbleSort(int[] arr){
    int n=arr.length;

    for(int i=0;i<n;i++){
      for(int k=0;k<n-i-1;k++){
        if(arr[k]>arr[k+1]){
          int temp=arr[k];
          arr[k]=arr[k+1];
          arr[k+1]=temp;
        }
      }
    }
  }
  public static void insertionSort(int[] arr){
    int n=arr.length;

    for(int i=0;i<n-1;i++){
      int smallest=i;
      for(int j=i+1;j<n;j++){
        if(arr[j]<arr[smallest]){
           smallest=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[smallest];
      arr[smallest]=temp;
    }
  }

}