package Interfaces;

import java.util.Scanner;




public  class C implements A,B {
    //int c=a+b;
  
    
     
     public void getc(){
         System.out.println("Enter the value of c ");
            Scanner in =new Scanner(System.in);
            int c = in.nextInt();
     }
     
      public void getd(){
         System.out.println("Enter the value of d");
            Scanner in =new Scanner(System.in);
            int d = in.nextInt();
           
     }
     
    
    
    
}