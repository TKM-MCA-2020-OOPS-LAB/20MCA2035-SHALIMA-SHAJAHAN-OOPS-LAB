package myproject;
import java.util.*;

public class Arraylist {

public static void main(String[] args) {
		
		// Creating ArrayList of type "String" which means we can only add "String" elements
		
		 ArrayList<String> obj = new ArrayList<String>();
		 
		 //adding elements to an ArrayList
		 
	      obj.add("Shalima");
	      obj.add("Appu");
	      obj.add("Akku");
	      obj.add("Sona");
	      obj.add(1, "Irfan");

	      // Displaying elements
	      
	      System.out.println("\n ArrayList after add operation:");
	      for(String str:obj)
	         System.out.println(str);

	      //Remove elements from ArrayList 
	      
	      obj.remove("Sona");
	      obj.remove(3);
	     
	      // Displaying elements
	      
	      System.out.println("\n ArrayList after remove operation:");
	      for(String str:obj)
	         System.out.println(str);

	      // Displaying final Array List
	      
	      System.out.println("\n Final ArrayList:");
	      for(String str:obj)
	         System.out.println(str);
	      
	      //Sorting the ArrayList
	      
	      Collections.sort(obj);
	      
	      System.out.println("\n  ArrayList after sorting:");
	      for (String str : obj) 
	         System.out.println(str);
	
	
	      //returns the object of list which is present at the specified index  
	      
	      System.out.println("\n Object at index 2:"+obj.get(2));
	     
	      // Checks whether the object is in the ArrayList
	      
	      System.out.println("\n Akku is in the ArrayList :"+obj.contains("Akku"));
	      System.out.println("\n Irfan is in the ArrayList :"+obj.contains("Irfan"));
	      
	      //Size of the ArrayList
	      
	      System.out.println("\n Size of the ArrayList:"+obj.size());
	      
	      // removing all the elements of the array list
	      
	      obj.clear();
	      
	      System.out.println("\n  ArrayList after clear method:"+obj);
	      
	}
	
}
