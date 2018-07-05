
package demo;
import java.util.Scanner;
public class op2 {
    
    static int a,i,j;

        static void getdata(){
            
            System.out.println("Enter ur no:");
            Scanner in = new Scanner(System.in);
            a=in.nextInt();
            
        }
        
       static void disdata(){
            
            for (i=1;i<=a;i++){
                System.out.println();
                for(j=i;j<=a;j++){
                        System.out.print("*");
                
                
                }
            }
            
            System.out.println();
        }
    
    
    public static void main(String ar[]){
      System.out.println("Proframm for star output");
                getdata();
                disdata();
    
    
    }
    
}
