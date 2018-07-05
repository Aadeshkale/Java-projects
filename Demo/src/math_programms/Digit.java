package math_programms;
import java.util.Scanner;
public class Digit{
  static int sum,reminder;
  static void Digit (int no){
      
        System.out.println("Addition of digit of an no example");
        while(no>0){
         reminder = no%10;
         sum=sum+reminder;
         no=no/10;
        
         
        } 
        
    } 
    
    public static void main (String[] args){
     Digit t = new Digit();  
     Digit(124567);    
     System.out.println("Addition of digits:"+sum);
     
    }
}