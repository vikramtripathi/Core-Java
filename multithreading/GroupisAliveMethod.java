package multithreading;

public class GroupisAliveMethod extends Thread{
    public void run(){
        try{
        System.out.println(Thread.currentThread().isAlive());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        
        GroupisAliveMethod thread = new GroupisAliveMethod();
        System.out.println("thread is start or not = " + thread.isAlive());
        thread.run();
        System.out.println("after starting a thread = " +  thread.isAlive());
    }
    
}
