package Collection;

import java.util.*;
import java.util.Iterator;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>();
        list.add("Ranjeet");
        list.add("Ankur");
        list.add("Shivam");
        list.add("Aakash");
        list.add("Vikram");
    Iterator itr = list.iterator();
    while(itr.hasNext())
    {
        System.out.println(itr.next());
    }
    
}
}
