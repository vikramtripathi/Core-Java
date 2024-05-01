package multithreading;

class Implementingrunnable implements Runnable {
    public void run(){
        System.out.println("This is Thread");
    }
    public static void main(String[] args) {
        Implementingrunnable i1 =new Implementingrunnable();
        Thread t1 = new Thread(i1);
        t1.start();

        
    }
    
}
