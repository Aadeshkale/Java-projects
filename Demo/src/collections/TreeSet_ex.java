
package collections;
import java.util.*;
public class TreeSet_ex {
  public static void main(String ar[]){
      System.out.println("Simple example on TreeSet");
        TreeSet t= new TreeSet();//Insertion order not perserved,elements added according to some sorting order
        
        t.add("A");
        t.add("a");
        t.add("l");
      //  t.add(12); // R.E hetrogenious objects not allowed 
        t.add("z");   
        t.add("z");
        t.add("Sonu");
        
        System.out.println("TreeSet"+t);
      /*   StringBuffer class does'nt implements comparable interface so it's objects are not comparable by default compareTo() 
        TreeSet t2= new TreeSet();
            t2.add(new StringBuffer("A")); 
            t2.add(new StringBuffer("e"));
            t2.add(new StringBuffer("Z")); 
           System.out.println("TreeSet"+t2); 
        */   
  
  
  }   
}
