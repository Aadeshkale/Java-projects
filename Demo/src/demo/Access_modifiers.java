
package demo;
import java.util.Scanner;

public class Access_modifiers {
 protected int a =10, b=12;
 
     int getdata(){
       System.out.println("Enter the values of A & B:");
       Scanner in = new Scanner(System.in);
          a=in.nextInt();
          b=in.nextInt();
                return a&b; 
     }
    
    
}
class test extends Access_modifiers  {
      int c ;
      
      void opration(){
           System.out.println("This is Second Class:");
           c=a+b;
           System.out.println("c:"+c);
      }
     
    public static void main(String... ar){
           System.out.println("Example on Access Modifiers:");
           test t= new test();
           t.getdata();
           t.opration();
    }

}