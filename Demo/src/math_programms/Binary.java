package math_programms;
import java.util.*;
public class Binary{
    int no,i,key,mid;
    int a[] = new int[10];
    Scanner in =new Scanner (System.in);
        void get(){
           System.out.println("Enter no:");
            no=in.nextInt();  
             for(i=0;i<no;i++){
                 System.out.println("Enter ur attay no["+i+"]:");
                 a[i]=in.nextInt();
             }
             System.out.print("ur array : a[");
             for(i=0;i<no;i++){
                 System.out.print(" "+a[i]);
            } 
             System.out.print(" ]");
        }
        void op(){
             System.out.println("Enter ur key no:");
             key=in.nextInt();
             mid=no/2;
             if(key==a[mid]){
                  System.out.println("Element found at: "+mid+" location");
             }
             else if(key>a[mid]){
                    for(i=mid+1;i<no;i++){
                        if(key==a[i]){
                            System.out.println("Element found at: "+i+" location");
                        }
                        else{
                              System.out.println("Element not found ain the list");     
                        }
                    } 
             }

            else if(key<a[mid]){
                    for(i=0;i<mid;i++){
                        if(key==a[i]){
                            System.out.println("Element found at: "+i+" location");
                        }
                        else{
                              System.out.println("Element not found in the list");     
                        }
                    } 
            } 
            
             
             
             
        
        }
    
    
    
	public static void main(String[] args){
              Binary b =new Binary();
              b.get();
              b.op();
        }
}