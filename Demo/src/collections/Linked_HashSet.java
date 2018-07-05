package collections;
import java.util.*;
public class Linked_HashSet {
    public static void main(String ar[]){
        System.out.println("LinkedHashset example");
          
        HashSet hd =new HashSet();
        
        hd.add(123);
        hd.add(null);
        hd.add(145);
        hd.add("shri");
        System.out.println("Hashset example"+hd); // insertion order is not presrved
        
        
        
        LinkedHashSet lhs = new LinkedHashSet(); // subclass of HashSet ,preserved  insertion order 
                                                 // sutable for caching applications
        lhs.add(123);
        lhs.add(null);
        lhs.add(145);
        lhs.add("shri");
        
        System.out.println("LinkedHashset"+lhs);
        
    }
}
