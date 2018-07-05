
package collections;
//import java.util.Collection;
import java.util.Vector;
public class vector {
    public static void main(String... ar){
        System.out.println("Vector collecton example");
        Vector vec =new Vector(4); // by default increased by 2*cc.  
        vec.add("Aadesh");
        vec.add("Sachin");
        vec.add("Shivam");
        vec.add("Rahul");
             System.out.println("Vector:"+vec);
        vec.add(20);
        System.out.println("Vector Capacity:"+vec.capacity());
        
        Vector v =new Vector(4,2);// increased by cc+2.
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println("Vector 2:"+v);
        System.out.println("Vector Capacity:"+v.capacity());
        v.add(5);
        System.out.println("Vector Capacity:"+v.capacity());
    }
}
