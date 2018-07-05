
package Garbage_Collector;

public class Runtime_Obj {
    public static void main (String... ar){
        System.out.println("Requesting  JVM for garbage collector by Runtime object!!");
        // Creating runtime object    
        Runtime r =Runtime.getRuntime();// Singleton class so calling factory method
            System.out.println("Total size of heap memory:"+r.totalMemory());
            System.out.println("Available heap memory:"+r.freeMemory());
               Runtime_Obj a[] =new Runtime_Obj[1000]; // array of objects
                  for(int i =0;i<100;i++){
                         
                        a[i]=new Runtime_Obj();          // creating 10000 objects  
                        a[i]= null;                      // nullifing objects
                  }
               
                  
            
            // requesting for GC to jvm
            r.gc();
            System.out.println("Available heap memory:"+r.freeMemory());
    
    }   
}
