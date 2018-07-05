
package demo.inheritance.A1;
import demo.inheritance.B1.*;



public class A1 extends B1 {
    
        void display(){
            System.out.println("Class A1 inherits the Properties of class B1");
            System.out.println("Value of A:"+a);
     //         System.out.println("value of B:"+b); gives error it is private in B1
              System.out.println("value of c:"+c); 
     //         System.out.println("value of d:"+d); gives error it is default in B1
              
        
        }
    
    
    
    public static void main (String... ar){
        System.out.println("This is A1 package class ");
        A1 b=new A1();
        b.display();
    }
    
}
