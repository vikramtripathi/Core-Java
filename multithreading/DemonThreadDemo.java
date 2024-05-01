package multithreading;

public class DemonThreadDemo extends Thread{
    public void run(){
        System.out.println("This is child Thread");
    }
public static void main(String[] args) {
    System.out.println("parent Thread");
    DemonThreadDemo d = new DemonThreadDemo();
    d.start();

}
}
