
package exception;

public class sample {
 static void op(){
     int a = 10,b=0,c;
       try
       { 
        c=a/b;
        System.out.println("c:"+c);
       }
       catch(Exception e){
          
           System.out.println("Divide by zero exception");
       
       }
        
    
    
    }
    
    
    
    public static void main(String... ar){
        System.out.println("A simple example on exception handling:");
        op();
    }

    
}
