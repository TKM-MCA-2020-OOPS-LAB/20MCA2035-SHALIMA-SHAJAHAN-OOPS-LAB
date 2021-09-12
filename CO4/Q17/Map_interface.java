package myproject;
import java.util.*;
public class Map_interface {

	public static void main(String[] args) {
		Map<Integer,String>map=new HashMap<>();
		
		map.put(1,"Mumbai");
		map.put(2,"TVM");
		map.put(3,"Chennai");
		System.out.println("Printing initial map: "+map);
		map.put(3,"Kolkata");
		map.put(2,"Hyderabad");
		System.out.println("Updated map: " +map);
		
		map.remove(1);
		System.out.println("Map after removal:"+map);
		
		

	}

}
