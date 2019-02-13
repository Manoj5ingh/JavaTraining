package p1;
import java.util.*;  

class ArrayListJava{  
   public static void main(String args[]){  
	   ArrayList<String> alist=new ArrayList<String>();  
      alist.add("Utkarsh");
      alist.add("Rahul");
      alist.add("Yugi");
      alist.add("Ram");
      alist.add("Raja");
      alist.add("Rome");
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      alist.add(3, "Work");
  
      //displaying elements
      System.out.println(alist);
   }  
}