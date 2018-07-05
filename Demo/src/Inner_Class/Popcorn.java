
package Inner_Class;
// Anonomus class is used for temprary requirenments i.e instance requirement
public class Popcorn {
   void teste(){
        System.out.println("the test is 'salty'");
    
    }
    
  static  Popcorn p1=new Popcorn(){
       void teste(){
           System.out.println("the test is 'spicy'");
       }
        
    
    };// creation of anonomous class
        
    
    
    public static void main(String... ar){
        System.out.println("example on Anonomus inner class");
        Popcorn p =new Popcorn();
        p.teste();
        p1.teste();
        // getting class files names of class
        System.out.println(" Popcorn class file:"+p.getClass().getName());
        System.out.println("Anonomus class file:"+p1.getClass().getName());
    }   
}
