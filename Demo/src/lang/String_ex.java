
package lang;

public class String_ex {
    public static void main (String ar[]){
        System.out.println("String example on String constant pool"); // special memory space for string
            String s= "Aadesh"; // crating string object in SCP i.e constant string
            String s1="Aadesh"; // pointing to same string object in SCP i.e constant string
            StringBuilder s2 = new StringBuilder("Aadesh");//creating string object in Heap area
            StringBuilder s3 = new StringBuilder("Aadesh");// creating seprate string object in Heap area 
            System.out.println(s.equals(s1)); // true // equals method in String class is used for content check
            System.out.println(s==s1); // true pointing to same object in SCP
            System.out.println(s.equals(s2)); // false //  poining to difftent objects
            System.out.println( s2.equals(s3));// false // equals method in StringBuilder class is used for refrernc comparing
            String s4 ="Aa"+"desh"; // cerating object in SCP i.e constant
            System.out.println( s1.equals(s4));// true
            String s5 = s+"kale"; // creates object in heap due to refrence variable
            final String s6 =s+"kale" ; // creates object in SCP due constant
            
            //refercing SCP object forrm Heap area
            
            String s7=s.intern();
            
    }
}
