
package demo;
import java.util.Scanner;
public class prime {
   static void in(){
        int n,m,i;
            System.out.println("prime example :");
             System.out.println("Enter the value of a:");
                Scanner in =new Scanner(System.in);
                n=in.nextInt();
                m=n/2;
                    for(i=2;i<=m;i++){
                        if(n%i==0){
                            System.out.println("No is not prime");
                        }else if(n%i!=0){
                            System.out.println("No is prime");
                                break;
                        
                        }
                        
                        
                        
                    } 
                    
                            
                               
                        
   }
        
        
        
    public static void main (String ...ar){
        System.out.println("To print numbers till given number");
                prime p =new prime();
                in();
    }
}
