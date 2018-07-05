
package Operators;

public class instaneof {
    // instance of oprator is used to check object is perticular type or not
    
   public static void main (String ar[]){
       System.out.println("instanceof oprator example");
       instaneof i = new instaneof();
       System.out.println(i instanceof instaneof);
       if(i instanceof Object){
           System.out.println("it is Object Type");
       }
   //    System.out.println(i instanceof String); // there should be reletionship between class,interface
       
   }  
}
