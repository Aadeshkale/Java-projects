package demo;
import java.util.Scanner; 

public class op4 {
   
    static int a,i,j;
    
        static int getdata(){
            System.out.println("Enter Ur no:");
                Scanner in = new Scanner(System.in);
                a=in.nextInt();
                return a;
        }
          
        static void disdata(){
                for(i=a;i>=1;i--){
                    System.out.println();
                    for(j=i;j>=1;j--){
                            System.out.print(j);
                    }
                
                
                }
  
   
          System.out.println();
          }
    
    
    
    
    public static void main(String[] ar){
        System.out.println("Star output in Assending order:");
        getdata();    
        disdata();
        
        
    }
    
    
}
