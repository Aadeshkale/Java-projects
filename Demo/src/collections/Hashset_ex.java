
package collections;
import java.util.*;
public class Hashset_ex{
    
   public static void main(String ar[]){
      System.out.println("A simple example on hash set");
      HashSet s = new HashSet();// set interface don't allow duplication,no preserved order 
                                 // initial size is 16 and Fill ratio is 0.75 (load ratio when it increase its size) 
       HashSet sh = new HashSet(10,0.80f);  // hash set with 10 capacity
       
       sh.add(121);
       sh.add(121);
       sh.add("Aadesh");
       sh.add("Rahul");
       sh.add("Amol");
       sh.add("sachin");
       sh.remove(0);
       sh.add("A");
       sh.add(null);
       sh.add(null);
       
     System.out.println("hash set:"+sh);  
       
      
      
   }
}
