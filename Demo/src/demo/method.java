package demo;
public class method {
 static int id = 100;  
    
  //  pass by value
    void updateid(int id){
        int newid = 10001;
        System.out.println("pass by value ID="+newid);
    
    }
  //  pass by refrence(object)
    static void updateid(method m2 ){
        
        m2.id=2002;
        System.out.println("pass by value ID="+id);
    
    }
    
    public static void main(String[] ar )
    {   
        System.out.println("A simple Example on method envocation ");
        method m1 = new method();
        method m2 = new method();
        m1.updateid(1000);
        updateid(m2);
    
    }
    
}
