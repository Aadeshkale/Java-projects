
package Inner_Class;

public class this_ex {
    int x=10; static int y=20;
        class inner{
            int x = 100;
                void op(){
                 int x = 1000;
                 System.out.println("Static access of y inside op:"+y);
                 System.out.println("The value of x inside op:"+x);
                 System.out.println("The value of current x of class inner :"+this.x);// or inner.this.x
                 System.out.println("The value of current x of class outer :"+this_ex.this.x);
                 
                }


        }
    
    public static void main (String... ar){
        System.out.println("Inner class 'this' example ");
       /* this_ex ex =new this_ex();
        this_ex.inner in = ex.new inner();*/
       new this_ex().new inner().op();
        
    } 
}
