
package collections;
import java.util.*;
public class Enumeration_ex {
   
     
    
  public static void main (String ar[]){
      System.out.println("Coursor enumeration example");
         Vector v = new Vector(); // Enumeration is applicable on only Lagacy Classes i.i Vector,Stack,Hashtable..
            for(int i=1;i<=10;i++){
                    v.add(i);
            }
             System.out.println("yor vector:"+v);
             
           Enumeration e = v.elements();
       
           while(e.hasMoreElements()){
               System.out.println("Acessing elements one by one :"+e.nextElement());           
           }
 }  
}
