package demo;
import java.util.Scanner;
public class Demo {
  
  int roll_no,fee ;
  String name;
    
    
      public void input()
        { 
           /* int roll_no,fee ;
            String name;*/
            Scanner in= new Scanner(System.in);
            
            System.out.println("Enter UR Roll no:");
            roll_no=in.nextInt();
            
            System.out.println("Enter UR name:");
            name=in.next();
        
            System.out.println("Enter UR fee:");
            fee=in.nextInt();
           
           
  
        }
       
          void display(){
               System.out.println("Ented data is:");
               
                 System.out.println("name:"+name+"\nrollno:"+roll_no+"\nfee:"+fee);
                
                }
            
    
         public static void main(String[] ar)
         {
             System.out.println("Enter Your Code !!! ");
             Demo d = new Demo();
             d.input();
             d.display();
             
         
         }
     
    
    
}
