package myproject;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hash_to_tree {

	public static void main(String[] args) {
		Map<String,String>map=new HashMap<String,String>();
		map.put("1","A");
	    map.put("2", "B");
	    map.put("3", "C");
	    map.put("4", "D");
	    map.put("5", "E");
	    map.put("6", "F");
	    Map<String,String>converted = new TreeMap<String,String>(map);
	    System.out.println("\nMap after converting HashMap to TreeMap: \n"+converted);
	    

	
	}

}
