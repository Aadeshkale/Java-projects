
package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Arraylist {
    
    public static void main(String... ar){
         System.out.println("Array list example");
         // creating array list simple method
         ArrayList list = new ArrayList();// inital capacity is 10 & incrased by (cc*3/2)+1
            list.add(12);
            list.add(16);
            list.add(12);
            list.add(131);
            list.add(0,"Aadesh");
         System.out.println("List:"+list);
          
          // creating synchronized version of ArrayList
        List L = Collections.synchronizedList(list); 
         // Another method
         Collection list2= new ArrayList();
            list2.add(12);
            list2.add(16);
            list2.add(125);
            list2.add(131);    
            
       
        

          System.out.println("List2:"+list2);
          list.add(list2);
          
          System.out.println("List:"+list);
          list.removeAll(list2);
          System.out.println("List:"+list);
          list.retainAll(list2);
          System.out.println("List:"+list);
          list.add(269);
          list.removeAll(list2);
          System.out.println("List:"+list);
    
    }
       
}
