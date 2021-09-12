package myproject;

import java.util.Scanner;

interface calculate {
	void input();
	void area();
	void peri();
	
}
class Circle implements calculate {
	
	double r,a,p;
	@Override
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of Circle:");
		r=sc.nextInt();
		
		
	}
	@Override
	
	public void area()
	{
		a=3.14*r*r;
		
		System.out.println("Area of the circle:"+a);
		
		
	}
	@Override
	public void peri() 
	{
		p=2*3.14*r;
		System.out.println("Perimeter of the circle:"+p);
		
	}
}

class Rectangle implements calculate {
	int l,b;
	double a1,p1;
	@Override
	public void input()
	{
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter the length of rectangle:");
		l=sc1.nextInt();
		System.out.println("Enter the breadth of rectangle:");
		b=sc1.nextInt();
		
	}
	@Override
	public void area()
	{
		a1=l*b;
		System.out.println("Area  of rectangle:"+a1);
		
	}
	@Override
	public void peri() {
		p1=2*l*b;
		System.out.println("Perimeter of rectangle:"+p1);
		
	}
	
	
}


public class Areaperimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle obj=new Circle();
		obj.input();
		obj.area();
		obj.peri();
		System.out.println();
		Rectangle obj1=new Rectangle();
		obj1.input();
		obj1.area();
		obj1.peri();
		
		

	}

}
