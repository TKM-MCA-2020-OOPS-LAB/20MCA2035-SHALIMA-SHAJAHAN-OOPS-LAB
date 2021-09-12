package myproject.arithmetic;

interface calculate
{
	int add(int a,int b);
	int subtract(int a,int b);
	int multiply(int a,int b);
	int division(int a,int b);
	
}
public class operations implements calculate
{
	@Override
	public int add(int a, int b)
	{
		 int add=a+b;
		System.out.println("addititon of the numbers gives:"+add);
		return add;
		
	}
	@Override
	public int subtract(int a,int b) 
	{
		int subtract=a-b;
		System.out.println("Subtraction of the numbers gives:"+subtract);
		return subtract;
		
	}
	@Override
	public int multiply(int a,int b)
	{
		int multiply=a*b;
		System.out.println("Multiplication  of the numbers gives:"+multiply);
		return multiply;
		
	}
	@Override
	public int division(int  a, int  b)
	{
	int division=a/b;
	System.out.println("Division of the numbers gives :"+division);
	return division;
	}
	
	
}
