package Garbage_Collector;

public class Student {
    Student s5 = method();

    // method of objects
        static Student method(){
            
            Student s3 = new Student(); // eligiable for Gc
            Student s4 = new Student(); // eligiable for Gc
            return s3;
        } 
    
    
    public static void main(String ar[]){
        System.out.println("Garbage collector example To eligiable objects for GC!!!");
          
            // Creation of objects 
        
            Student s1 = new Student();
            Student s2 = new Student();
 
            // nullifing objects
            s1=null; // eligiable for Gc
            s2=null; // eligiable for Gc
            
    } 
    
    
}
