
package demo;

public class Static {
   static int a=45;
   
    static void opration(){
        int b=100;
        
         System.out.println("The value of a:"+a);        
    
    }
    
    
    void display(){
    
       System.out.println("The value of a in display method:"+a);
            //   static void add(){
    
                 
    }
    
     
    
    public static void main(String... ar ){
        System.out.println("Statc method & mmember's  example:");
        opration();
        Static s= new Static();
        s.display();
        
    }
    
}
