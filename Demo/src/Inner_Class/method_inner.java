
package Inner_Class;

public class method_inner {
 // In java method inside method is not possiable
    
    void op(){
     int y = 100;
            class inner{
                     void add ( int a,int b){
                         int c = a+b;
                         System.out.println("The Addition is:"+c);
                           System.out.println("The value of y is:"+y);
                             
                     }    
            }
    //we have to create the objects of inner class inside the method        
        inner i =new inner();
        i.add(200, 23);
        i.add(20, 23);


        } 
    
    
  public static void main(String... ar){
      System.out.println("Examole of method local inner class ");
        method_inner m= new method_inner();
        m.op();
  
  }
}
