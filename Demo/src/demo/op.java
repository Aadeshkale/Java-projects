package demo;
import java.util.Scanner;


public class op {
    int a,i;
    
        int getdata(){
            System.out.println("Enter ur No:");
            Scanner in = new Scanner(System.in);
                a=in.nextInt();
                    return a;
        }
        
         void disdata(){
             for(i=1;i<=a;i++ ){
                 System.out.println();
                 for(int j=i;j<=a;j++){
                     
                     System.out.print(j);
                 
                 }
             
             
             }
             
             
             
    
        }
    
    
    
    public static void main(String ar[]){
        System.out.println("Sequence output one");
        op o= new op();
        o.getdata();
        o.disdata();
    
    }
    
}
