package myproject;
import java.util.Scanner;

public class Shapes {

  double a;
  
	double area()
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter value of l: ");
		int l=sc1.nextInt();

		a=l*l;
		System.out.println("Area of square:" +a);
		return a;	
	}
	double area(int r)
	{
		a=3.14*r*r;
		System.out.println("Area of circle:" +a);
		return a;
	}
	double area(int b,int h)
	{
		a=0.5*b*h;
		System.out.println("Area of triangle :" +a);
		return a;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes obj = new Shapes();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of b,h");
		int b=sc.nextInt();
		int h=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		obj.area(b,h);
		obj.area(r);
		obj.area();
		
		

	}

}
