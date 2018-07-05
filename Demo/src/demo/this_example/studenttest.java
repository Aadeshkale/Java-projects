
package demo.this_example;

public class studenttest {
    
    public static void main (String... ar){
        int[] ids=new int[]{1,2,3};
        student s1 = new student( ids[0],"Aadesh");
        student s2 = new student( ids[1],"Shivam");
        student s3 = new student( ids[2],"Kunnal");
        
        System.out.println("Student1:"+s1.name);
        System.out.println("Student2:"+s2.name);
        System.out.println("Student3:"+s3.name);
        
         s1.update_profile("kale");
        System.out.println("Updated neme of Student1:"+s1.name);
         
    }
    
}
