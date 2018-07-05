
package Operators;

public class bitwise {
   int a= 5,b= 4; 
    void op(){
        
        System.out.println(true & false); // if both are true answer is true
        System.out.println(true | false); // if one of the true answer is true
        System.out.println(true ^ false); // if both are diffrent answer is true
        
        System.out.println(a&b); // logicalx-or and
        System.out.println(a|b); // logical or
        System.out.println(a^b); // logical and
        
        // "~" complement oprator applicable for only integarals
            
        System.out.println(~4); // 2's complement
        
        
    }
    
     public static void main (String ar[]){
         System.out.println("Bitwise oprator example!!");
         bitwise b = new bitwise();
         b.op();
     }
}
