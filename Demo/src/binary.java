import java.util.*;
public class binary {

   int a[] = new int[10]; 
         int mid,i,j,s;
         Scanner in = new Scanner(System.in);
         
    void get(){
             System.out.println("Enter the no of element :");
             
             j=in.nextInt();
             
             for(i=0;i<j;i++){
                    System.out.println("Enter ur:"+i+"element:");
                    a[i]=in.nextInt();
             }
             for(i=0;i<j;i++){
                    System.out.println("Entered :["+i+"] element:" +a[i]);
             }
    }
    
    void opration(){
            
            mid = (0+j)/2;
            System.out.println("Entered mid:"+mid);
            System.out.println("Enter Ur Search element:");
            s=in.nextInt();
            
            if(s==a[mid]){
                  System.out.println("Element found at: mid location");  
            }else if(s>a[mid]){
                    for(int c=mid+1; c<j;c++){
                            if(s==a[c]){
                                System.out.println("Element found at: "+a[c]+" location");
                            }
                    }
             }else if(s<a[mid]){
                    for(int c=0; c<mid;c++){
                            if(s==a[c]){
                                System.out.println("Element found at: "+a[c]+" location");
                            }
                    }
             }else{
                    System.out.println("Element not found !!");
             
             }
            
        }
            
  
    
    
    public static void main(String ar[]){
        System.out.println("Binary search Programm:");
        binary b = new binary();
        b.get();
        b.opration();
    }

    
}
