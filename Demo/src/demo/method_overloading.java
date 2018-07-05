
package demo;

public class method_overloading {
    
            static void display(){
               int a=10;
               System.out.println("simple method A=:"+a);
             }
            
            static void display(int a){
                 a=a+a;
                 System.out.println("overloaded method A="+a);
             }
            
            static void display(int b,int c){

                 System.out.println("overloaded method B="+b+" "+"c="+c);
             }
            
            static void display(int[] d){

                 System.out.println("Array overloaded method ");
             }
    
    public static void main(String[] ar){ 
        System.out.println("Method overloading Example:");
        display();
        display(100);
        display(12,13);
        int[] d= new int[]{1,2};
        display(d);
     
    }
}
