
package collections;
import java.util.Iterator;
import java.util.LinkedList;
public class likedlist {
    public static void main(String ar[]){
        System.out.println("LinkedList example");
           LinkedList al = new LinkedList(); 
            al.add(12);
            al.add(null);
            al.add(32);
            al.add(45);
            al.add(184);
            al.add(345);
        System.out.println("LinkedList "+al);    
          Iterator it =  al.iterator();  
            while(it.hasNext()){
                System.out.println(it.next());
            }
    
    }
}
