
package collections;
import java.util.*;
public class TreeSet_sorting {
    public static void main (String ar[]){
        System.out.println("Costum sorting of TreeSet");
        TreeSet t= new TreeSet(new myComparator());
            t.add("A");
            t.add("AA");
            t.add("Sachin");
            t.add("a");
            t.add(new StringBuilder("AC"));
            t.add(new StringBuilder("Aadesh"));
       
         System.out.println("Sorted string"+t);   
            
    }
    
}
 class myComparator implements Comparator{
     
     public int compare(Object obj1,Object obj2){
       String s1,s2;
        s1 = obj1.toString();
        s2 = obj2.toString();
          int  l1=s1.length();
          int l2 =s2.length();
            if(l1>l2){
                return 1;
            }  
           else if(l2>l1){
            
               return -1;
            }
           else if(l1==l2){
             return  s1.compareTo(s2);
           
           }
        
        return 0;
        }
 
 }