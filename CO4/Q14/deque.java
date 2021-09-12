package myproject;
import java.util.*;

public class deque {
	public static void main(String[] args) {
		 Deque<String> deque = new ArrayDeque<String>();

		 Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of elements: ");
			int n=sc.nextInt();
			System.out.println("Enter the Elements: ");
			for(int i =0;i<n;i++)
			{
				String s=sc.next();
				deque.add(s);
		 
			}
			System.out.println("\nInitial Queue after addition: " + deque);
			System.out.println("\nAfter removing all elements:");
			
			
			for(int i =0;i<n;i++)
			{
				
				deque.pop();
		 
			}
			System.out.println("\nFinal Queue is: " + deque);
		

	}

}
