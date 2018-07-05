
package lang;

public class Equals_ex {
    String name;
    int roll;
      Equals_ex(String name,int roll){
          this.name=name;
          this.roll=roll;
      
      }  // overiding equals method
        /*    public boolean equals(Object obj){
               String name1 = this.name;
               int  roll1=this.roll;

               Equals_ex e =(Equals_ex)obj;

               String name2 = e.name;
               int  roll2=e.roll;

               if(name1.equals(name2)&&roll1==roll2){
                   return true;
               }
               else{
                   return false;
               } 
            }
      */
      
      
      
      
    
  public static void main (String ar[]){
    System.out.println("Equals method of Object class");
    // equals method of bject class compare only objet refrence only not content
        Equals_ex e1= new Equals_ex("Aade",12);
        Equals_ex e2= new Equals_ex("Aade",12);
        Equals_ex e3= new Equals_ex("Sachin",13);
        Equals_ex e4= e3;
        
        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3));
        System.out.println(e3.equals(e4));
  }  
}
