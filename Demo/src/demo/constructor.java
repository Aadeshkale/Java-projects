
package demo;

public class constructor {

    
    int id;
    String name;
    
       constructor(){
            System.out.println("This is simple construtor");
        
        }
        
        constructor(int uid,String uname){
            System.out.println("This is paraametarized constructor:");
            id =uid;
            name=uname;
            System.out.println("Id:"+id+"\nname:"+name);
        
        }
    
    
    
    public static void main (String... ar){
        System.out.println("Contructor method example");
            constructor  c1 =new constructor(121,"AAdesh"); 
            //  constructor();
    }
    
}
