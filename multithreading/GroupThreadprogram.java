package multithreading;

public class GroupThreadprogram implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) {
     
        GroupThreadprogram thread = new GroupThreadprogram();

        ThreadGroup tg3= new ThreadGroup("Parent Thread");

        Thread tg4 = new Thread(tg3,thread,"Vikram");
        tg4.start();

        Thread tg5 = new Thread(tg3,thread,"Shivam");
        tg5.start();

        Thread tg6 = new Thread(tg3,thread,"Ankur");
        tg6.start();

        Thread tg7 = new Thread(tg3,thread,"Ranjeet");
        tg7.start();

        System.out.println("Thread group name" +tg3.getName());
        tg3.list();

        
    }
    
}
