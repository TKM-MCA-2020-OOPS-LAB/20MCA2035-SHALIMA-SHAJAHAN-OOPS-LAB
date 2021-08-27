package myproject;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Createset {
	public static void main(String[]args) {
		Set<Integer>s=new LinkedHashSet<Integer>();
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements to be added : ");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		while(n!=0) 
		{
			int x=sc.nextInt();
			s.add(x);
			n--;
			
		}
		System.out.println("Printing set:" +s);
		System.out.println("Enter the elements to be deleted: ");
		int d=sc.nextInt();
		if(s.remove(d)) {
			System.out.println("Set after removal :"+s);
			
		}
		else {
			System.out.println("Element is not found in the given set !");
			
		}
		System.out.println("Iterating over set: ");
		Iterator<Integer>i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
			
		}
	}

}
