
package Inner_Class;

public class static_ex {
    int x=10;
    static int y = 20;
    
    static class inner{
    
        void op(){
            System.out.println("Static nested Inner class method ");
             System.out.println("the value of static contex:"+y);
            // System.out.println("the value of instance contex:"+x); // error
        
        }
        
        public static void main(String ar[]){
            System.out.println("Static nested Inner class main method ");
        
        }
    }
    public static void main (String ar[]){
        System.out.println("Static nested Inner class ");
        inner i = new inner();
        i.op();
        
    }
}

/*java staic_ex == outer class main method 
  java inner == inner class main method

*/
