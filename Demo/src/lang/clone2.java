
package lang;

class cat {
    int j;
    cat(int j){
        this.j=j;
    }
}

public class clone2 implements Cloneable {
    cat c;
    String s;
    clone2(cat c,String s){
        this.c=c;
        this.s=s;
 }
    public  Object clone()throws CloneNotSupportedException{
        cat c4 = new cat(c.j);
        clone2 c5 =new clone2(c4,s);
        
        return c5;
    }
    
    
   public static void main(String... ar) throws CloneNotSupportedException{
      System.out.println("Deep cloneing example");
       
      cat c=new cat(20);
      clone2 c2 = new clone2(c,"Abc");
      clone2 c3 = (clone2) c2.clone(); 
    /*  System.out.println(c3.s+" "+c3.c.j);
      c3.s="Asd";
      c3.c.j=100;
     System.out.println(c3.s+" "+c3.c.j);
   */
   } 
}
