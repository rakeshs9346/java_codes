package Sorting;

public class ArraySorting{
    public static void main(String[] args){
        int nums[]={7,9,2,3,5};

       // bubbleSort(nums);
       //selectionSort(nums);
       insertionSort(nums);

        for(int n:nums){
            System.out.print(n+" ");
        }
}
    //bubblesort
    //time complexity-O(n^2)
    public static void bubbleSort(int[] arr){      //largest value sort first
        for(int i=0;i<arr.length-1;i++){
           for(int j=0;j<arr.length-i-1;j++){
              if(arr[j]>arr[j+1]){
               int temp=arr[j];
               arr[j]=arr[j+1];
               arr[j+1]=temp;
              }
           }
        }
   }
    //SelectionSort
    //time complexity-O(n^2)
    public static void selectionSort(int[] arr){    //smallest value sort first
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
    //time complexity-O(n^2)
    //Insertion Sort
    public static void insertionSort(int[] arr){

        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int j=i-1;

            while(j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }

    }
   
}