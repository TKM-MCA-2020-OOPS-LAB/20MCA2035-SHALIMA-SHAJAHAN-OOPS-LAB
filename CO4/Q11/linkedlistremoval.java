package myproject;
import java.util.*;
public class linkedlistremoval {
	public static void main(String[] args) {
	     LinkedList<String> l_list = new LinkedList<String>();
	          l_list.add("Amritha");
	          l_list.add("Shali");
	          l_list.add("Anu");
	          l_list.add("Haseena");
	          l_list.add("Duppu");
	     
	   System.out.println("The linked list is: " + l_list);

	    l_list.clear();
	 
	    System.out.println("The  linked list after removal of elements : " + l_list);
	}

}
