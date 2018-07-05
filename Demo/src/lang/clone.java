
package lang;

public class clone implements Cloneable  {
 // Shallo clone method
    
    int a = 10;
    String s = "abc";

    
    public static void main (String ar[]) throws CloneNotSupportedException{
        System.out.println("clone onject example ");
        clone c= new clone ();
        clone c2 =(clone)c.clone(); //   typecasting is mandotary
        
        System.out.println(c.a+" "+c.s+" clone-->"+c2.a+" "+c2.s);
    
    
    }
    
}
