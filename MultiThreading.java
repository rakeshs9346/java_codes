public class MultiThreading implements Runnable{
     public void run(){
        System.out.println("thread is running");
     }
    public static void main(String[] args) {
        MultiThreading t1=new MultiThreading();
        MultiThreading t2=new MultiThreading();
        Thread thread1=new Thread(t1); 
        Thread thread2=new Thread(t2); 

        thread1.start();
        thread2.start();
        

    }
}
