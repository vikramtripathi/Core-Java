package multithreading;


public class ThreadStart extends Thread {
    public void run(){
        System.out.println("Start the thread");
    
    }


    public static void main(String[] args) {
        ThreadStart t1=new ThreadStart();
        t1.start();
       
    }
    
}
    