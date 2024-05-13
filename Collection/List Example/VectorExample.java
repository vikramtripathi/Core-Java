package Collection;
import java.util.Vector;
import java.util.Iterator;

public class VectorExample {
    public static void main(String[] args) {
        Vector <String> v = new Vector<String>();
        v.add("Ranjeet");
        v.add("Ankur");
        v.add("Shivam");
        v.add("Aakash");
        v.add("Vikram");
    Iterator <String> itr = v.iterator();
    while(itr.hasNext()) {
        System.out.println(itr.next());
}
System.out.println("================================================");
        System.out.println(v);
}
}
