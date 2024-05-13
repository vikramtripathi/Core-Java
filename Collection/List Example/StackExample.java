package Collections;

import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack <String> s = new Stack<String>();
        s.push("Ranjeet");
        s.push("Ankur");
        s.push("Shivam");
        s.push("Aakash");
        s.push("Vikram");
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.pop());

    
}
