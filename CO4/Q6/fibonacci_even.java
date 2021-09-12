package myproject;
import java.util.Scanner;
public class fibonacci_even {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		fibonacci f = new fibonacci();
		Thread thread = new Thread(f);
		thread.start();
		thread.sleep(200);
		
		System.out.println();
		
		

		even_no e = new even_no();
		Thread threads = new Thread(e);
		threads.start();
		threads.sleep(200);
	
		
		

	}

}

class fibonacci implements Runnable {
	@Override
	public void run()
	{
		int i,n,a=0,b=1,c;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit of fibonacci sequence required :");
		n=sc.nextInt();
		System.out.printf("\nFibonacci sequence...");
		System.out.println();
	
		System.out.printf(a+"\t"+b);
		for(i=0;i<=n;i++) 
		{
			c=a+b;
			System.out.printf("\t"+c);
			a=b;
			b=c;
			
			
		} 
		
	}
}

class even_no implements Runnable {
	@Override
	public void run() 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the limit for displaying even numbers : ");
		
		n=sc.nextInt();
		System.out.println("\n...Even numbers ....");
		
		for(i=0;i<=n;i++) 
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		} 
		System.out.println();
	
	}
}

