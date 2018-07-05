
package Operators;

public class Add_op {
   // exception case :"+" only oprator in java which is overloaded 
    
   int a=10,b=20;
   String s ="Aish";
  
   
    void op(){
        System.out.println(a+b);// Addition 
        System.out.println(s+b);// concatanation  
        System.out.println(a+b+s);// concatanation  
        System.out.println(s+a+b);// concatanation


    
    }
    
    public static final strictfp synchronized void main(String...ar){
        System.out.println("'+' oprator example");
        Add_op a =new Add_op();
        a.op();
        
    } 
}
