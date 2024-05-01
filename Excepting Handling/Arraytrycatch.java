public class Arraytrycatch {
    public static void main(String[] args) {
        
        int a[]=new int[5];
        try{
            a[0]=2;
            a[1]=4;
            a[3]=5;
            a[4]=6;
            a[5]=8;
            a[6]=10;
        }
        catch(Exception e){
            for(int i=0; i<a.length;i++);
        System.out.println(e);

    }
    
}
}
