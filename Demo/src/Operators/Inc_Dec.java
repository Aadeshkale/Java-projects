
package Operators;

public class Inc_Dec {
  void op(){
   int a =10,b=20,c,d;
        c= ++a; // pre increment oprator
        System.out.println("value of a:"+a);
        System.out.println("value of c:"+c);  
        d=b++;
        System.out.println("value of b:"+b);
        System.out.println("value of d:"+d); // post increment oprator
        
        char s ='a';
        s++;  
        System.out.println("value of s:"+s); // incremented by one
        byte e =10;
        e++;
        System.out.println("value of e:"+e);
 
        byte f =127;
        e++;
        System.out.println("value of f:"+f);
 
        boolean m =true;
      //  m++; // not allowed on boolean
       
   
   }
   
    
    public static void main (String ar1[]){
        System.out.println("Incriment & Decrement oprator");
        Inc_Dec d =new Inc_Dec();
        d.op();
        
    }
}
