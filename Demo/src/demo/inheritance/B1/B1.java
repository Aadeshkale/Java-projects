
package demo.inheritance.B1;


public class B1 {
        public int a=10;
        private int b =23;
        protected int c =110;
        int d=1000;
        void display(){
              System.out.println("This is package B1\n");
              System.out.println("Value of A:"+a);
              System.out.println("value of B:"+b);
              System.out.println("value of c:"+c);
              System.out.println("value of c:"+d);
              
        }
    
    
       public static void main(String ar[]){
           System.out.println("Example on Inheritance");
                B1 b =new B1();
                b.display();
       }
}
