
package Inner_Class;

public class Regular_inner {
  int a=10;  
  
    class inner{
        
        // never contain static delerations
            public void display(){
                System.out.println("main method inside inner class");
            
            }
    }
    
    void creat(){ 
    
        inner i3=new inner(); 
         System.out.println("Calling by outer class method to inner class method"); 
         i3.display();
         
    
    }
    
    
     public static void main(String... ar){
         System.out.println("Simple example on Regular Inner class ");
        
        // Simple Approach to access inner class code    
         
         Regular_inner r =new Regular_inner();// outer class object
                Regular_inner.inner i = r.new inner(); // inner object
                  i.display(); // clling innner class method 
                  
                // Second way  to create inner class object
 
                Regular_inner.inner i2 = new Regular_inner().new inner();
                i2.display();
                //  third way to creting inner class Object
                new Regular_inner().new inner().display();
                
                
                r.creat(); // calling inner class method form outer class method   
     }
     
}
