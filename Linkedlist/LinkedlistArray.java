package Linkedlist;

class LinkedList{
    Node head;
     
    class Node{
      int data;
      Node next;
   
      Node(int data){
         this.data=data;
         this.next=null;
      }
   }
   LinkedList(int[] nums){
      this.head=new Node(nums[0]);
      Node current=head;

      for(int i=1;i<nums.length;i++){
         current.next=new Node(nums[i]);
         current=current.next;
      }
   }
   public void printList(){
         Node curr=head;
         while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
         }
         System.out.println();
   }
   public void delFirst(){
      if(head==null){
         System.out.println("list is empty");
      }
      System.out.println(head.data);
      head=head.next;
      
   }
   public void delLast(){
      if(head==null){
         System.out.println("list is empty");
         return;
      }
      if(head.next==null){
         head=null;
      }

      Node prevNode=head;
      Node lastNode=head.next;

      while(lastNode.next!=null){
         prevNode=prevNode.next;
         lastNode=lastNode.next;
      }
      prevNode.next=null;
   }
   public int lengthOfList(){
      int len=0;
      Node current=head;
      while(current!=null){
         current=current.next;
         len++;
      }
      return len;
   }

}
public class LinkedlistArray{
   public static void main(String[] args){
        int[] arr={1,2,3,4,5};
         LinkedList list=new LinkedList(arr);

         list.printList();
         // System.out.println(list.lengthOfList());
          
         
   }
}