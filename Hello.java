
class Animal{
  String name;
  String color;
  int age;

  Animal(String name,String color,int age){
       this.name=name;
       this.color=color;
       this.age=age;
    System.out.println(name+","+color+","+age);
  }


}

class Dog extends Animal{

   String breed;
   String dogType;

 
   Dog(String name,String color,int age,String breed,String dogType){
    super(name,color,age);
    
       this.breed=breed;
       this.dogType=dogType;
       System.out.println(breed+","+dogType);
   }
}
class Cat extends Dog{
   String sound;

   Cat(String name,String color,int age,String breed,String dogType,String sound){
    super(name, color, age, breed, dogType);
    this.sound=sound;
    System.out.println(sound);
   }
}
public class Hello{
    public static void main(String[] args) {
    //  Dog obj=new Cat("cat", "white", 2, "husky", "pet", "meow");

      int[] arr={1,2,3,4,5};
      //leftRotate(arr,2);
      rightRotate(arr, 2);

      for(int num:arr){
         System.out.print(num+" ");
      }
   

    }
    public static void rightRotate(int[] arr,int k){
      int n=arr.length;
      int low=0;
      reverseR(arr,low,n-k-1);
      reverseR(arr,n-k,n-1);
      reverseR(arr,low,n-1);
    }
    public static void reverseR(int[] arr,int low,int high){
      while(low<=high){
         int temp=arr[low];
         arr[low]=arr[high];
         arr[high]=temp;
         low++;
         high--;
      }
    }
    public static void leftRotate(int[] arr,int d){
      int n=arr.length;
        int low=0;
        d=d%n;
        
        reverseL(arr,low,d-1);
        reverseL(arr,d,n-1);
        reverseL(arr,low,n-1);
    }
    public static void reverseL(int[] arr,int low,int high){
       
        while(low<=high){
          int temp=arr[low];
          arr[low]=arr[high];
          arr[high]=temp;
          low++;
          high--;
        }
    }

}