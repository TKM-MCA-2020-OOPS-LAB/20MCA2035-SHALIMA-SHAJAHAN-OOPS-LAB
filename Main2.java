package myproject;
import java.util.Scanner;

import myproject.arithmetic.operations;


public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		
		operations obj1=new operations();
		obj1.add(a,b);
		obj1.subtract(a,b);
		obj1.multiply(a, b);
		obj1.division(a,b);
		

	}

}
