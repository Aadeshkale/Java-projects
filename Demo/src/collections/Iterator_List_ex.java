package collections;
import java.util.*;
public class Iterator_List_ex {
   public static void main (String ar[]){
       System.out.println("List Iterator example");
            LinkedList l1 = new LinkedList();
            l1.add("Aadesh");
            l1.add("Shivam");
            l1.add("Kunnal");
            l1.add("Amol");
        System.out.println("Liked list:"+l1);
   
        ListIterator itr =l1.listIterator(); // ListIterator is applicable on list objects
                                             // ListIterator support read,remove,replace,insertion opration in both directions
        
                                             
              while(itr.hasNext()){
         //   System.out.println("Accessing elements one by one:"+itr.next());
              String s = (String)itr.next(); // getting linkedlist elementss in String
              if(s=="Aadesh"){
                  itr.set("Sonu");// replacement opration
              } 
              else if(s=="Shivam"){
                  itr.remove(); // remove opration
              }
              else if(s=="Amol"){
                  itr.add("Rahul"); // add opration
              }
         }
         System.out.println("Linked list"+l1);  
 
   } 
}
