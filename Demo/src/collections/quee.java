
package collections;
import java.util.ArrayDeque;
import java.util.Deque;
public class quee {
    public static void main(String ar[]){
        System.out.println("Deque example");
        //FIFO
            Deque<String> dl= new ArrayDeque();
                dl.add("harry potter");
                dl.add("wings of fire");
                dl.add("Gita");
            System.out.println("Deque Books"+dl);      
            System.out.println(dl.remove());
            System.out.println(dl.remove());
            System.out.println(dl.remove());
        //For stack use pop method 
    }
}
