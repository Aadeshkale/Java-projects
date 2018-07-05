package demo;
import java.util.Scanner;


public class op5 {
    
 static   int a,i,j;
 
        static int getdata(){

            System.out.println("Enter ur number:");
                Scanner in = new Scanner(System.in);
                a=in.nextInt();       
                return a;
        }

        static void disdata(){
            for(i=1;i<=a;i++){
                System.out.println();
               for(j=a;j>=i;j--){
                   System.out.print(j);
               
               }
            
            }
            
        
        }
    
    
    
    
    
    
    public static void main (String[] ar){
        System.out.println("Programm for decending order ");
            getdata();
            disdata();
    
    }
    
    
}
