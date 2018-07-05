
package Operators;
public class Equal {
   void op(){
       int a= 10;
       int b= 10;
       char c ='a';
       int d= 97;
       float f= 97.0f; 
       System.out.println(a==b);
       System.out.println(c==d); //Got promoted into int
       System.out.println(c==f); //Got promoted into float
       
       String s="Aadesh";
       String s2="Aadesh";
       System.out.println(s==s2);
       
   } 
    public static void main (String... ar){
        System.out.println("'==' oprator  ");
         Equal e = new Equal();
         Equal e1 = new Equal();
         Equal e2 = new Equal();
         e = e2;
         e.op();
         System.out.println("'==' oprator is also meant for refrence checking ");
         System.out.println(e==e1);
         System.out.println(e1==e2);
         System.out.println(e==e2);
         
    }
    
}
