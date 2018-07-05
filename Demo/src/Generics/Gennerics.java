
package Generics;

public class Gennerics<T> {
  T  a, b; // T ype variables
    T ob;   // T ype objects
    
       Gennerics(T a,T b ){  // Generic constuctor with Generic type
            this.a= a;
            this.b=b;
        }
        void show(){
          System.out.println("The vale of a:"+a);
          System.out.println("The Object type of a:"+a.getClass().getName());
          System.out.println("The vale of b:"+b);
          System.out.println("The Object type of b:"+b.getClass().getName());
        
        }    
        
        Gennerics(T ob){
          this.ob=ob;
      //  return ob;
        }
        
    
  public static void main (String[] ar){
      System.out.println("My generic class example");
      //  Gennerics gb =new Gennerics (); invalid
      
        Gennerics<String> g = new Gennerics<String>("Aadesh","kale");// String geenerics 
        g.show();
        Gennerics<Integer> g2 = new  Gennerics<Integer>(10,23);
        g2.show();
        Gennerics<String> g3 = new Gennerics<String>("Abx");
        System.out.println("Type of object:"+g.getClass().getName());
  }  
}
