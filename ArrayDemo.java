class Arraydemo{
    public static void main(String[]args) {
        //Syntax to create array in java
        //<datatype> <arraylines>[]=new <datatype>[<,[i:0>]];
        // int    marks[] =new int[6];
        String days[] = new String[7];


        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";
        
        for(int i=0; i<=6; i++){
        System.out.println(days[i]);
    }
}
}
