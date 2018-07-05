package demo;
import java.util.Scanner;


public class contiop {
   static  int a,i,j,p=1;
        
    static int getdata(){
      System.out.println("Enter the no of rows:");
        Scanner in = new Scanner(System.in);
            a=in.nextInt();
                return a;
    }
     
    static void disdata(){
            for(i=1;i<=a;i++){
                System.out.println();
                for(j=1;j<=i;j++){
                    System.out.print(p);
                    p++;
                }
            
            }
    
    }
    
    
    
    
    public static void main(String ar[]){
        System.out.println("A programm for simple continous output");
                getdata();
                disdata();
        
    }
    
}
