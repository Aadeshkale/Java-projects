
package lang;


public class Equals_ex_2 {
    static void op(){
       
        String s1 =new String("Aadesh") ;
        String s2 =new String("Aadesh");
        
        StringBuilder a1 = new StringBuilder("Aadeh");
        StringBuilder a2 = new StringBuilder("Sunil");
        
        System.out.println(s1==s2);         // '==' oprator compare refrence only
        System.out.println(s1.equals(s2)); // in String class equals method overidded to compare content
        System.out.println(a1==a2); 
        System.out.println(a1.equals(a2)); // equals method check refrence 
        
    // System.out.println(s1==a2); //  gives compile time error
        System.out.println(a1.equals(s2)); // by defaylt false
        
        
        
    
    }
    
    
    public static void main(String ar[]){
        System.out.println("Equal method & '==' oprator");
        op();
        
    
    }
    
}
