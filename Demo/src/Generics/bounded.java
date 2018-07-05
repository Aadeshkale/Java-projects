
package Generics;
import java.util.Scanner;
class bounded<T extends Number & Comparable> { //bounded to number class i,e int,sort,byte,long
  //class bounded<T extends Number & Comparable> valid
    // class bounded<T extends Runnable & Number> invalid due to class should be first
    // class bounded<T implements Runnable >  invalid due to bounded never use implements
    // class bounded<T extends Runnable>  valid
    
    
    T a,b;
    void get(T a,T b){
            this.a = a;
            this.b = b;
            System.out.println("Value of a:"+a);
            System.out.println("Value of a:"+b);
 
    }
    
    
    
    
    public static void main(String ar[]){
        System.out.println("Bounded generics example");
        bounded<Integer> b = new bounded<Integer>();
        // bounded<String> b = new bounded<String>();// invaild due to bounded to number class
        
        b.get(22,2);
    
    }
}
