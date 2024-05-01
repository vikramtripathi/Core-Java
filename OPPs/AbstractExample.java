package OPPs;

abstract class AbstractAnimal {
    public abstract void animalSound();
    
    public void sleep() {
        System.out.println("Zzz");
    }
}

class Pig extends AbstractAnimal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

    

