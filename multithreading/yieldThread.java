package multithreading;

public class yieldThread  extends Thread {
    public void run() {
        for(int i=1;i<3;i++){
                 System.out.println(Thread.currentThread().getName()   +   "myThread"); 
    }
    
}
public static void main(String[] args) {
    yieldThread y1=new yieldThread();
    yieldThread y2=new yieldThread();
    y1.start();
    y2.start();

    for (int i=1; i<3; i++){
        y1.yield();
        System.out.println(Thread.currentThread().getName()   +   "myThread1");
    }
}
}
