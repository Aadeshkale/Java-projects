
package demo;

public class tenary_example {
   
    static int min(int a,int b){
    int result;
    result = (a>b)? a:b ;   
     System.out.println("maximum value="+result);   
    return result;
    }

    public static void main(String... ar){
        System.out.println("Example of ternary oprator");
        min(8,9);
        
        
    }
}
