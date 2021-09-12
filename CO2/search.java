package myproject;
import java.util.Scanner;


public class search {

	public static void main(String[] args) {
		int n,x,flag =0, i=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter no.of elements");
		n= s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements:");
		for(i=0;i<n;i++)
		{
			a[i] = s.nextInt();
			
		}
		System.out.print("Enter the element to be search:");
		x=s.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==x)
				
			{
				flag=1;
				break;
				
			}
			else
			{
				flag=0;
				
			}
		}
				if(flag==1)
				{
					System.out.println("Enter found at position:"+(i+1));
					
				}
				else
				{
					System.out.println("Element not found");
					
				}
		
		
		
		
		
		
		// TODO Auto-generated method stub

		
	}

}
