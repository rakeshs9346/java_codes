public class Prac{
    public static void main(String[] args){
            
        int nums[]={5,4,1,2,3,6,8,7,1};
        //bubbleSort(nums);
        //selectionSort(nums);
        insertionSort(nums);
        for(int num :nums){
            System.out.print(num+" ");
        }
            
    } 
    public static void bubbleSort(int[] arr){
        int n=arr.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int[] arr){

        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int smallest=i;
            for(int j=i+1;j<n;j++){
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
        int n=arr.length;

        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
    
    
}