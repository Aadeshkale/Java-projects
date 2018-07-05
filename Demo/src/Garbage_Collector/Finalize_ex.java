package Garbage_Collector;

public class Finalize_ex {
    public static void main(String... ar ){
            System.out.println("Example of Finalize method");
                Finalize_ex c = new Finalize_ex();
                c=new Finalize_ex();// refreenceing oject i.e eligiable for GC 
                Runtime.getRuntime().gc(); // object will definatly  destoyed by gc
                
              // c.finalize(); // explicit call no object is destoyed by gc
    }
           public void finalize(){
           
              System.out.println("Performing cleanup activities");
              
              System.out.println(10/0);// Divide by zero ignored by jvm not by programmer
              
              
           }
    
}
