
package demo;
/*A method wich is avaible form java 5*/
public class varargus {
  
    static void getdata(int... a){
   
            System.out.println("varargus method example");
        }
    
   public static void main (String... ar){
        System.out.println("Example of Varargus method");
        int[] a ={1,2,3,4,5,6};
        getdata(a);
   
   } 
}
