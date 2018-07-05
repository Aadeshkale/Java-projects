
package Garbage_Collector;

public class Test {
    public static void main(String []ar){
            System.out.println("Garbage collector example reassingning the refrence ");
            Test t1 =new Test();
            Test t2 =new Test();
            // Reassinging the Refrence method
            
            t1 =new Test(); // eligiable for GC
            t1 = t2; // eligiable for GC
    }
}
