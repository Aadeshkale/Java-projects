
package lang;

public class HashCode {
    int roll_no;
     // hashCode metod can be overloaded in proper Way 
    
   public int hashCode(){
   return roll_no;  // properway because it gives unquie hashCode to each obj
   //return 100;    //  inproperway because it gives same hashCode to each obj
   } 
    
    
    
    public static void main(String ar[]){
        System.out.println("Hash Code Example!!");
        HashCode h = new HashCode();
            int hashcode = h.hashCode() ;
                System.out.println("hash code of h obj."+hashcode);
    
    }
}
