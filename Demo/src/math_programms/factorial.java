
package math_programms;
import java.util.Scanner;
public class factorial {
    int a=1,i;
    
        int facto(){
             
            System.out.println("Enter ur no :");
                Scanner in =new Scanner(System.in);
                 a=in.nextInt();
                 int result=1;
                    for(i=1;i<=a;i++){

                        result=result*i;

                    }
             System.out.println("factorial of ur no :"+result);
        return a;
        }
    
        public static void main(String... ar){
            System.out.println("Simple example on factorial of any no:");
                  factorial fa =new factorial();
                  fa.facto();
        }
}
