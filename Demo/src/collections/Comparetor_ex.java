
package collections;
import java.util.*;
public  class Comparetor_ex  {
    public static void main(String ar[]){
        System.out.println("Comparator Interface example");
            TreeSet t= new TreeSet(new Test());
                t.add(12);
                t.add(0);
                t.add(15);
                t.add(17);
        System.out.println("treeSet with coustum sorting order:"+t);        
                
    }
    
}
 class Test implements Comparator{
    public int compare(Object obj1,Object obj2){
        Integer i1=(Integer)obj1;
        Integer i2=(Integer)obj2;
         return  -i1.compareTo(i2); // reverse order
        // return 1 //  insertion order is perserved
        // return -1 // reverse of insertion order
         
        // return  i2.compareTo(i1); // reverse order
        // returm 0 // first element will return
         
          /*  if(i2>i1){
               return +1;
            }
            else if(i1>i2){
               return -1;
            }
            else{
               return 0;
            }  */ 
            
            
    }
}



