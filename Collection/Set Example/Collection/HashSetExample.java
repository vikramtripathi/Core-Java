package Collection;

import java.util.HashSet;

class Demo{
    int id;
    String name;
    double salary;
    
    public Demo(int id, String name, double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    
}
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Demo> h = new HashSet<Demo>();
        Demo d1 = new Demo(101, "Gorakhpur", 65000);
        Demo d2 = new Demo(102, "Vikram", 85000);
        Demo d3 = new Demo(103, "Ayush", 75000);

        h.add(d1);
        h.add(d2);
        h.add(d3);
        for(Demo d : h)
        {
          System.out.println("employee id = "+ d.id+"\n"+"Employee Name =" +d.name + "\n" +"Employee Salry= "+ d.salary);
        }  
}
}
}
