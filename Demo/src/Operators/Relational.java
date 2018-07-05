
package Operators;

public class Relational {
   //  relational oprators <,>,<=,>= , note: = assignment oprator
    void op(){
       int a=0,b=20;
       char c='a';
       char d='A';
       float f= 97.0f;
       boolean g =true;
       boolean h =true;
       System.out.println(a>b); 
       System.out.println(c>b); // internal type-cassting
       System.out.println(c==f);// internal type-cassting
       System.out.println(c>d);
    // System.out.println(h>g); // not applicable on boolean type
       
    
    }
    
    
    public static void main(String... ar){
        System.out.println("Reletional oprators");
        Relational r = new Relational();
        r.op();
    }
}
