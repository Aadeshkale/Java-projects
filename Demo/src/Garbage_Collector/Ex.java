
package Garbage_Collector;

public class Ex {
   static Ex  i;
    
    
    public static void main (String... ar){
        System.out.println("Island of isolation objects for Garbage collector!!!");
           Ex e1 = new Ex();
           Ex e2 = new Ex();
           Ex e3 = new Ex();
           // Internal bounding
           
           e1.i= e2;
           e2.i= e3;
           e3.i= e1;
           
          //nullifing
          
          e1 = null;// not eligiable for GC due to e3.i=e1
          e2 = null;// not eligiable for GC due to e1.i=e2 
          e3 = null;// All are eligiable for GC due to no extarnal link
           
           
    
    }
}
