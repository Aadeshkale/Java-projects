
package collections;
import java.util.*;
public class Itrator_ex {
    

    public static void main(String ar[]){
        System.out.println("Itrator coursor example");
            ArrayList al = new ArrayList();
                al.add("Aadesh");
                al.add(212);
                al.add("Sachin");
                al.add(23);
                al.add(null);
                al.add("Aadesh");
                al.add(212);
                al.add("Sachin");
                al.add(23);
        System.out.println("ArrayList:"+al);
         Iterator itr =  al.iterator(); // cration of iterator, iterator supports read,remove oprations
                                        // iterator is appicable to all Collection classes
        
          while(itr.hasNext()){
            System.out.println("Accessing elements one by one:"+itr.next());
          
          
          }                                        
    }
    
}
