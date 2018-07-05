package demo;

import java.util.Scanner;
public class Vowel {
    char ch ;//,a,e,i,o,u,A,E,O,U;
    
    
    char getdata(){
      System.out.println("Enter UR Charector:");
           Scanner in =new Scanner(System.in);
                 ch=in.next().charAt(0);
                 return (ch);
    }
    
    void output(){
        if(ch=='A' || ch=='a'|| ch=='E'||ch=='e'|| ch=='i'|| ch=='I'|| ch=='o'||ch=='O'|| ch=='u'||ch=='U')
        {
            System.out.println("Enterd chater is Vowel!!");
        
        }
        else{
        
               System.out.println("Enterd chater is Consonent!!");
        
        }

        
        }
    
    
    
    
    public static void main(String[] ar){
        
        System.out.println("A Simple Programm for to check wthether entred letter is vowel or not");
        Vowel v =new Vowel();
        v.getdata();
        v.output();

        
    
    
    }
    
}
