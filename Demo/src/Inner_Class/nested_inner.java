
package Inner_Class;


public class nested_inner {
    class A{
        class B{
            class C{
                void m1(){
                     System.out.println(" class 'c' method ");
                
                }
            }
        }
    
    }
    public static void main(String... ar){
        System.out.println("Nested inner classes!!!");
         nested_inner in = new nested_inner(); 
         nested_inner.A a = in.new A();
         nested_inner.A.B b = a. new B();
         nested_inner.A.B.C c = b. new C();
         c.m1();
        // another method
         new nested_inner().new A().new B() . new C() .m1();
         
        
    }
}
