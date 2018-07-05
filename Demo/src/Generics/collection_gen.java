package Generics;
import java.util.ArrayList;
public class collection_gen {
   static void create(){
        // facing problem of type safe
        ArrayList al = new ArrayList();
        al.add("AAdesh");
        al.add(1234);
        al.add("AAd440");
        String name =(String)al.get(0); // typecasting for element retrival
        
        // Achiving type safe by generic type
        ArrayList<Integer> all =new ArrayList<Integer>();
        all.add(101);
        all.add(102);
        all.add(103);
        Integer i = all.get(0); // typecasting is not required for element retrival
        
        System.out.println("no's:"+all);

    }  
    public static void main(String []ar){
        System.out.println("Generic Classes example");
        create();
    }
    
}
