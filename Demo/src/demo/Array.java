
package demo;


public class Array {
    
     static void disdata(){
        // Array declerations
         int a[]= new int[]{1,2,56,569,454,459};
         
         System.out.println("arraylenght:"+a.length);//print lenght of an array
        
         int ab[]=new int[10];
         
         
        // Char Arrays

        char s[]=new char[]{'a','e','i','o','u'};
        char[] ex =new char[5];
        
        // Acessing Array Elements:
        
        System.out.println("a[4]=="+a[4]);
 
     }
    
    public static void main (String[] as){
        System.out.println("A simple example of Array Decliration ");
           disdata(); 

    }
    
    
}
