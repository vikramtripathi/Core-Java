package multithreading;

public class InterrptException1 extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
     public static void main(String[] args) {
        InterrptException1 t1 = new InterrptException1();

        t1.start();
        t1.interrupt();
      
    }
}