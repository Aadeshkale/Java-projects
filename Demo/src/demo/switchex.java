package demo;
import java.util.Scanner;
public class switchex {
    static int a,b,c;
        static int ch;
        static int getdata()
        {
            System.out.println("Enter Ur choice:");
                 Scanner in =new Scanner(System.in);
                   ch=in.nextInt(); //.charAt(0);
            System.out.println("Enter the value of A:");
               
                a=in.nextInt();
            System.out.println("Enter the value of B:");
                b=in.nextInt();
             return a&b ;
        }
            static void disdata(){
                switch(ch){
                case 1 : c=a+b;
                        System.out.println("Addition ="+c);
                        break;
                case 2 : c=a-b;
                        System.out.println("Substration ="+c);
                        break;
                case 3 : c=a*b;
                        System.out.println("Multiplication ="+c);
                        break;
                case 4 : c=a+b;
                        System.out.println("Division ="+c);
                        break;
                case 5 :break;
                default:
                        System.out.println("Envalid choice try again");
                        break;
                
                
                
                }
                
                
            }
        
    
    public static void main(String ar[]){
        System.out.println("A simple Switch case example");
        System.out.println("*******Menu*******");
        System.out.println("1.Addition");
        System.out.println("2.Substraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("4.Exit");
        
        getdata();
        disdata();
        
    }
}
