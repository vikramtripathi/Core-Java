package Strings;
public class Equal {  
    public static void main(String[] args) {  
        String s1 = "Shivam";    
        String s2 = "Shivam";    
        String s3 = "Shivam";  
        System.out.println(s1.equals(s2));   
        if (s1.equals(s3)) {  
            System.out.println("both strings are equal");  
        }else System.out.println("both strings are unequal");     
    }  
} 