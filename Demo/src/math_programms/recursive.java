
package math_programms;

public class recursive {
    int funt(int num){
        
            if(num!=0){
                System.out.println ("num"+num);
                return num + funt(num-1);
                
            }
            else{

                return num;
            }
            
       }  
     public static void main(String... ar ){
           System.out.println ("let's code"); 
            recursive f = new recursive();
            f.funt(3);
       
             
             }
}
