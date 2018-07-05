
package lang;

public class Autoboxing2 {
    public static void m(Integer I){
        System.out.println("Autoboxing");// it has high priority than varargs
    
    }
    public static void m(long l){
        System.out.println("widding");  // widing has highest priority it comes at jdk 1.0  
    
    }
    
    public static void m(int... a){
         System.out.println("varargs"); // it has lowest priority because it simillar to default case
    
    }
    int a=10; // primitive
    Integer i=100; // Autoboxing
 //  Long l=100;  // invalid because primitive can't converted to Long i.e winding -> A.B == x
    long j= 10; // winding
    
    Long k = 10L; // valid because long->Long winding 
 //   int z=10L; // invalid Long is not converted into int
    Object o = 10;
    Number n = 10;
    
    
    public static void main(String ar[]){
        System.out.println("winding,Autoboxing,vararg example");
            int x=10;
            m(x);
    
    }
}
