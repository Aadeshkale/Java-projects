
package demo;
   
public class final_example {
   static final int l=65,j=30;
    // final variable is assign at runtime only ..
 
   
    static void opration(){ 
            System.out.println("Final veriable value l:"+l+"\nj:"+j);
          //     l=l+2; erorr it can't change it's value
        
        }

    
    
    public static void main(String... ar){
        System.out.println("Final veriable example:");
        opration();
       
    }
}
