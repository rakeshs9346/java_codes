
public class Practise{
    public static void main(String[] args) {
       
    //  int arr[]={0, 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

    //  moveZerosToEnd(arr);
    //  for(int n:arr){
    //     System.out.print(n+" ");
    //  }

    //decimal to binary string -->binary string to reverse binary bits -->to decimal number

    // int num=10;

    // String binaryNum=Integer.toBinaryString(num);
    // System.out.println(binaryNum);
    
    // StringBuilder sb=new StringBuilder();

    // for(char ch:binaryNum.toCharArray()){
    //     sb.append(ch=='0'?'1':'0');
    // }

    // String binary=sb.toString();
    // System.out.println(binary);
    // System.out.println(Integer.parseInt(binary,2));


    
    //  int num=5244;

    //  int rev=0;
    //  int product=1;

    //  while(num>0){
    //     rev=num%10;
    //     product=product*rev;
    //     num=num/10;

    //  }
    //  System.out.println(product);
     

    
    }
    public static void moveZerosToEnd(int[] arr){
        int n=arr.length;
        int index=0;

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[index++]=arr[i];
            }
        }
        while(index<n){
            arr[index++]=0;
        }
    }
}