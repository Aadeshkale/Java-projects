
package lang;
// by default access Object Class form java.lang package
public class toString_ex  {
   String name;
   int roll_no;
  
   toString_ex(String name,int roll_no){
        this.name = name;
        this.roll_no =roll_no;
    
    }
    // over writing toString mathod of object class
      /*  public String toString(){
        
            return "{"+getClass().getName()+"}"; // default body contain 
                                                 // return getClass().getName()+"@"+Integer.toHexString(hashCode())
        }*/
   
   
    
   public static void main (String ar[]){
       System.out.println("toString method of Object class");
             toString_ex s =new  toString_ex("Aadesh",101);
             System.out.println(s); // calling default toString method
             System.out.println("Hash code of an object:"+s.hashCode());
   
   }
    
    
}
