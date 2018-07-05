/*
Implicite casting hirache
    byte    8-bit
    short   16-bit
    int     32-bit
    long    64-bit
    float   32-bit
    double  64-bit


*/

package demo;


public class Casting {
         
   static void disdata(){
        System.out.println("Implicite/Automatic type casting:");
            byte a=10;
            short m=a;
            int b=m;
            System.out.println("a:"+a);
            int c= 100;
            float d=c;
            System.out.println("d:"+d);
            
        System.out.println("Explicite/Manual type casting:\n");    
        
        long s =1131331457;
        int t =(int) s;   
          System.out.println("t:"+t);  
        float nm=2.189f;
        int df =(int)nm;
         System.out.println("df:"+df);
        
          
          
    }
    
    
    
    public static void main (String[] args){
        System.out.println("A simple example of type casting:\n");
            disdata();
    
    }
    
}
