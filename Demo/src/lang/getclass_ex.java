package lang;
import java.lang.reflect.*;
public class getclass_ex {
   //  curreent class object gives class level information like constructors,methods,name..etc   
    
    void display(){
        System.out.println("AaAAaaadesh");
        
    }
    
 public static void main(String... ar){
     System.out.println("getClass method of object class");
       Object o= new String("Aaesh");
        Class c = o.getClass(); // current class class object
        System.out.println("Fullyqualified class:"+c.getName());  
            Method [] m= c.getDeclaredMethods();
                for(int i =0;i<m.length;i++){
                    System.out.println("method:"+m[i].getName());
                }
 
 }   
}
