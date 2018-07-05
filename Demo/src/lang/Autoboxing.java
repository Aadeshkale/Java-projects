
package lang;

public class Autoboxing {
    
    
    
    Integer b = new Integer(10);// Wrapper oject value
    int a =10;                   // primitive value
                                 
    
    Integer i = 10; // converting primitive value into Wrapper object
    //  Integer i = Integer.valueOf(10);       // Autoboxing
     
    int j =i; // converting Wrapper object value into primitive value
              //int j  = i.intValue(); // Autounboxing
    
   // Study cases
        void study() { 
         Integer m = 10;        // it usese internal buffer single object for multipurpose
         Integer n = 10;                    // it has size -128 to 127
         System.out.println(m==n);
         
         Integer m1 = 1000;        // it usese internal buffer single object for multipurpose
         Integer n1 = 1000;                    // it has size -128 to 127
         System.out.println(m1==n1);
       
     
         Integer k = new Integer(10); // new object instance
         Integer j = new Integer(10); // new object instance
         System.out.println(k==j);
         
         Integer k1 = new Integer(10); // new object instance
         Integer j1= 10;                
         System.out.println(k1==j1);
         
         int c = 128;
         int d = 128;
         System.out.println(c==d);
         
         int e = 1000;
         Integer f = 1000;
         System.out.println(e==f); 
         
         boolean a= true;
         boolean b= true;
         System.out.println(a==b);
         
         
         /* internal buffer range for mutiporpose refrences 
         Ineger == -128 to 127
         Charector == 0 to 127
         boolean == true,false (Always avaible)
         Double == -128 to 127
         Short  == -128 to 127
         byte   == (Always avaible) 
         */    
         
         
         } 

    
    
    
    
   public static void main(String...ar){
       System.out.println("Autoboxing // Autounboxing");
            Autoboxing a= new Autoboxing();
            a.study();
   }  
}
