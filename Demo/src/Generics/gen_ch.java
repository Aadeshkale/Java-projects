
package Generics;
import java.util.ArrayList;
public class gen_ch {
      
    void create(){
    ArrayList <String> as = new ArrayList();    // valid generics concept is avaible at only compile time only
    
    ArrayList<?> al = new ArrayList();// Accept any type Arraylist
    ArrayList<String> a2 = new ArrayList<String>(); // Accept only Arraylist of String type
  // ArrayList<?> a3 = new ArrayList<?>(); // invalid requried to pass class or interface in r.h.s
    ArrayList<? extends Number > a4 = new ArrayList<Integer>();// Accept any class subclass of Number class
    ArrayList<?> a5 = new ArrayList<Integer>();// valid can accept any type like integer,string,object..
   // ArrayList<? > a7 = new ArrayList<? extends Number>();
  //invalid requried to pass class or interface in r.h.s which are not bouded.
     ArrayList<? super Runnable> a6 = new ArrayList<Object>(); // Super keyworld can be use with "?" 
     // Accept any Superior of Runnable class
    }
    
    
    
    public static void main (String ar[]){
        System.out.println("Example on Generic charector '?' ");
    
    
    }
}
