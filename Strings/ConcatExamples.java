package Strings;

public class ConcatExamples {
    public static void main(String[] args) {
        
        String str1="Hello";
        String str2= "Vikram";
        String str3= "Tripathi";
    
        //for concate one string
        String str4= str1.concat(str2);
        System.out.println(str4);
        
        //for concat more than one

        String str5=str1.concat(str2).concat(str3);
        System.out.println(str5);
    }
    
}
