package multithreading;

public class GetNameAndSetNameThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("thread Task1");
    }
    public static void main(String[] args) {
        GetNameAndSetNameThread t1 = new GetNameAndSetNameThread();
        t1.start();
        System.out.println(Thread.currentThread().getName());
        
    }
    
}
