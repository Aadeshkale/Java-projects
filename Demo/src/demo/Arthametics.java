
package demo;

public class Arthametics {
    
    int a=10,b=65,c;
  
     void opration(){
         int d,e;
         d=a++;
          System.out.println("a:"+a+" "+"d:"+d); 
         e=++a;
         System.out.println("a:"+a+" "+"e:"+e);
         e+=5;
         System.out.println("e:"+e);
         System.out.println("Opator promotion rule::");
         char y=50,z=53,x;
         System.out.println("y:"+y);
         System.out.println("z:"+z);
         x='y'+'z';
         
         System.out.println("x:"+x);
         
     
     } 
    
    
    public static void main (String... ar){
        System.out.println("Example on Arathamec Oprators");
            Arthametics a1= new Arthametics();
            a1.opration();
    }
}
