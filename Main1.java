package myproject;

import java.util.Scanner;
import myproject.graphics.figures;

public class Main1 {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of rectangle : ");
		int l = sc.nextInt();
		System.out.println("Enter the breadth of the rectangle : "); 
		int b = sc.nextInt();
		System.out.println("Enter the base of the triangle :");
		int b1 = sc.nextInt();
		System.out.println("Enter the height of the triangle :");
		int h = sc.nextInt();
		System.out.println("Enter the side of the square :");
		int s = sc.nextInt();
		System.out.println("Enter the radius of the circle :");
		int r = sc.nextInt();
		
		figures obj1 = new figures();
		obj1.rectangle(l, b);
		obj1.triangle(b1, h);
		obj1.square(s);
		obj1.circle(r);
		
		

	}

	

}
