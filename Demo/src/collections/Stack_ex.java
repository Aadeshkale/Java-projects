
package collections;
import java.util.*;
public class Stack_ex {
  public static void main(String ar[]){
      System.out.println("Stack example");
        Stack s= new Stack();// LIFO
        s.add(10);
        s.push(20);
        s.pop();
        s.peek();// Access top of stack without removel
       
      System.out.println("Stack:"+s);
      System.out.println("Stack:"+s.capacity());
      System.out.println (" found at:"+s.search(10));// gives index form top,if not found it returns -1
      
      
  }  
}
