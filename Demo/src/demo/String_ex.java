
package demo;
import java.lang.String;

public class String_ex {
    //String criation 
    String s ="Aadesh";
    String s1="aadesh";
    String s2= new String("Sunil");
    String s3="Kale";
    
    
        
      void oprations(){
             System.out.println("\nFirst name:"+s+"\nsecond name:"+s2+"\nLast name:"+s3);
                    
             System.out.println("\nFinding lenght of String");
                 
             System.out.println("\nFirst String:"+s.length()+"\nsecond String:"+s2.length()+"\nLast  String:"+s3.length());
       
             //  concatination
             
            System.out.println("\nString Concatanation Using \"+\" oprator");
                      String s4=s+s2+s3;
            System.out.println("Cocatanation result: "+s4);

            System.out.println("\nString Concatanation Using \"StringBuilder\" oprator");
            
            StringBuilder sb= new StringBuilder();
            sb.append(s);
            sb.append(s1);
            
            System.out.println("\nCocatanation result: "+sb);
            
            
            // comparision of string
            
            System.out.println("\ncomprision result of String "+s.compareTo(s2));
                      
           // equals ,startwith end withexample

             System.out.println("Equals: "+s.equals(s2));
             System.out.println("Equals: "+s.equalsIgnoreCase(s1));
                System.out.println("Start with : "+s.startsWith("aadesh"));
                   System.out.println("Start with : "+s.endsWith("h"));
           
            // Uppercase - Lower case
            System.out.println("\nUpper case : "+s.toUpperCase());
            System.out.println("Upper case : "+s2.toLowerCase());
            
            //index of 
            
               System.out.println("indexof : "+s1.indexOf("a"));
               System.out.println("indexoflast : "+s1.lastIndexOf("a"));
               
            // Subsstrings 
            
            System.out.println("Susstring : "+s.substring(2));
            System.out.println("Susstring : "+s.substring(2,4));
            
            //spilt 
            String[] a = s.split("d");
          
            for(String temo: a){
               System.out.println("Spilt : "+temo);
            }
               
      }
   
    
    
    
    
   public static void main(String... ar){
       System.out.println("String examples");
            String_ex bn=new String_ex();
            bn.oprations();
   } 
}
