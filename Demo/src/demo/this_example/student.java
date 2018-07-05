package demo.this_example;




public class student {
    int id ;
    String name;
    String gender ="male";
    
            student(int id,String name){
                this(name);   
                this.id=id;

            }
            student(String name){
                this.name=name;

            }
            boolean update_profile(String name){
                this.name="kale";
                return true;
            }
    
}
