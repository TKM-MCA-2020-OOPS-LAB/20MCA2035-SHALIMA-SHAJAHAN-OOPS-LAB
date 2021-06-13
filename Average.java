package myproject;
import java.util.Scanner;
class neg_exception extends Exception {
	public neg_exception(String s) 
	{
		super(s);
		
	}
	
}


public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,sum=0;
		int a[];
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit: ");
		n=sc.nextInt();
		
		a=new int[n];
		System.out.println("Enter the numbers : ");
		for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		try { 
			for(i=0;i<n;i++)
			{
				if(a[i]<0)
				{
					throw new neg_exception("Wrong!! Enter positive numbers ..");
					
				}
				else {
					sum=sum+a[i];
					
				}
			}
			avg =sum/n;
			System.out.println("Average= "+avg);
			
			
		}
		catch(neg_exception e) {
			System.out.println("Exception occured"+e );
			
			
		}
		
		

	}

}
