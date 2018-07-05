package lang;
public class Hashcode_2 {
   static void op(){
   String s = new String("kalpna");
   String s2 = new String("kalpna");
    
    System.out.println(s.equals(s2)); // equals method compare content in String class
    
     System.out.println(s.hashCode()); // simillarly hashCode also overrided for give same hashCode for equivalant onjects 
     System.out.println(s2.hashCode());
    
   StringBuilder b  = new StringBuilder( "Aish");
   StringBuilder b1 = new StringBuilder( "Aish");
   
     System.out.println(b.equals(b1)); // equals method compare refrence  
     System.out.println(b.hashCode()); // hashCode gives diffrent hashcode  
     System.out.println(b1.hashCode());

    }
   
   public static void main(String ar[]){
       System.out.println("equals & hashCode method bond example");
        op();     
   }  
}
