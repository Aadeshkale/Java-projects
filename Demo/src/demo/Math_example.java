
package demo;
import java.lang.Math;
public class Math_example {
  
    static  float a= 10.9f,b=454f;
      
        static  void oprations (){
              //random no double     
              System.out.println("Random no :"+Math.random());

                 // roudfigure
              System.out.println("Rounfigure of a:"+Math.round(a));   

              // floor roundfig
              System.out.println("floor of a:"+Math.floor(a));

              // ceil roundfig
              System.out.println("ceil of a:"+Math.ceil(a));

              // max 
               System.out.println("maximum number:"+Math.max(a,b));
              //min
               System.out.println("minimum number:"+Math.min(10,12));

          }
    
    public static void main (String... ar){
        System.out.println("Simple example on math class:");
    
        Math_example m= new Math_example();
        oprations();
    }
    
}
