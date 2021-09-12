package myproject;
import java.util.Scanner;
import java.io.*;
import java.lang.*;

public class Thread_1 {

	public static void main(String arg[]) throws InterruptedException
	{
		ThreadA a = new ThreadA();
		ThreadB b = new ThreadB();
		a.start();
		a.sleep(200);
		b.start();
		b.sleep(200);
	}
	}
	class ThreadA extends Thread
	{
	public void run()
	{
		 
		System.out.print(".......MULTIPLES OF 5.....\n");
	int i;


	for (i=1;i<=15;i++) {
	System.out.println(+5+ "x" +i+ " = "+ 5*i);
	}
	System.out.println("\n");
	System.out.println("....................................");

	}
	}
	class ThreadB extends Thread
	{
	public  void run()
	{
	int i, j, c,N;
	    
	    System.out.println("ENTER THE LIMIT:");
	    Scanner sc= new Scanner(System.in);
	    N=sc.nextInt();
	    System.out.println("Prime numbers between 1 and " + N + " are:");
	    for (i = 1; i <= N; i++)
	    {

	        if (i == 0 || i==1)
	            continue;
	        c = 1;
	 
	        for (j = 2; j <= i / 2; ++j)
	        {
	            if (i % j == 0)
	            {
	                c = 0;
	                break;
	            }
	        }
	 
	        if (c == 1)
	            System.out.println(i + " ");
	    }
	    System.out.println("\n");
	}
}
