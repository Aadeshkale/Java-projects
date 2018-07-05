
package Abstract_example;
 
abstract public class abstract_ex extends Super{
    void test1 (){
           System.out.println("This is Abstract class Example ");
     
     }
             
    
    
    public static void main (String... ar){
        System.out.println("Simple Example on Abstract class ");
      //error  abstract_ex v = new abstract_ex(); // ca not be initallize
       display();
        
    }
}
