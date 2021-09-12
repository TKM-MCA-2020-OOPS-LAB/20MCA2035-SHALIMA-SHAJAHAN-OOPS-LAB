package myproject;
import java.util.*;

class sort {
	
	void sorting(int ar[],int n) {
		int temp;
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-1-i;j++) {
				
				if(ar[j]>ar[j+1]) {
					 temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
	
	}
	
	void display(int ar[],int n) {
		for (int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
			}
   
}
}
public class Bubblesort {

	public static void main(String[] args) {
		
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the size of Array  :");
		n=sc.nextInt();
		System.out.println("Enter the Elements :");
		int ar[] = new int[n];
		for(i=0;i<n;i++)
		{
			ar[i] = sc.nextInt();
		}
		sort  obj= new sort  ();
		System.out.println("Before Sorting:");
		 obj.display(ar,n);
		
		 obj.sorting(ar,n);
		 
		System.out.println("\nSorted Array is :");
		 obj.display(ar,n);
	}
}
