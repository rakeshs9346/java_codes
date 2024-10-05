package Array;

public class UnionArrays {
    public static void main(String[] args) {
        int[] arr1={1,1,2,3,4,5};
        int[] arr2={2,3,4,4,5,6};

        int[] union_of_Arrays=unionOfSortedArrays(arr1, arr2);
        for(int num:union_of_Arrays){
            System.out.print(num+" ");
        }
    }
    //Approaches-Hashset,Treeset,Two pointers
    public static int[] unionOfSortedArrays(int[] arr1,int[] arr2){
        int n1=arr1.length;
        int n2=arr2.length;
        
        int i=0;
        int j=0;
        int[] union=new int[]{};
        while(i<n1 && j<n2){
            if(arr1[i]<=arr2[j]){
            if(union.length==0 || union[union.length-1]!=arr1[i]){
                union[union.length]=arr1[i];
               
            }
            i++;
          }else if(arr2[j]<arr1[i]){
            if(union.length==0 || union[union.length-1]!=arr2[j]){
                union[union.length]=arr2[j];
                
            }
            j++;
          }
        }

        while(i<n1){
            if(union.length==0 || union[union.length-1]!=arr1[i]){
                union[union.length]=arr1[i];
                
            }
            i++;
        }
        while(j<n2){
            if(union.length==0 || union[union.length-1]!=arr2[j]){
                union[union.length]=arr2[j];
                
            }
            j++;
        }
        return union;
    }
}
