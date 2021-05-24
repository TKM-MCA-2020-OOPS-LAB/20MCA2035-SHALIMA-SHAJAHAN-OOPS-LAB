package myproject;

import java.util.Scanner;


public class Employee1 {
	int Empid;
	String Name;
	String Address;
	double Salary;
	
	
	public Employee1(int id,String nam, double sal, String adr)
	{
		Empid=id;
		Name=nam;
		Salary=sal;
		Address=adr;
		
	}
	
	static class Teacher extends Employee1
	{
	
		String department;
		String subject;
		
		public Teacher(int id,String nam,double sal,String adr,String dept,String sub1)
		{
			super(id,nam,sal,adr);
		
			department=dept;
			subject=sub1;
			
			
			
		}
		
			void display()
			{
				
				
				System.out.println("...Employee details....");
				System.out.println("Employee id:"+Empid);
				System.out.println(" Name:"+Name);
				System.out.println("Address "+Address);
				System.out.println("Salary of employee"+Salary);
				System.out.println("...Teacher's details...");
				System.out.println("Department:"+department);
				System.out.println("Subject:"+subject);
				
			}
		}
		
	

	public static void main(String[] args) {

		int i,count;
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of teachers to display their details: ");
		count=sc.nextInt();
		Teacher a[]  =new Teacher[count];
		
		for(i=0;i<count;i++)

		{
			System.out.println("Enter the Employee id: ");
			int id1=sc.nextInt();
			System.out.println("Enter the person name:");
			String nam1 =sc.next();
			System.out.println("Enter the Address: ");
			String adr1=sc.next();
			System.out.println("Enter the Salary:");
			double sal1=sc.nextDouble();
			System.out.println("Enter the  Department:");
			String dept1=sc.next();
			System.out.println("Enter the Subject:");
			String sub=sc.next();
			
			a[i]=new Teacher(id1,nam1,sal1,adr1,dept1,sub);
		
			
		}
		
		
		System.out.println("Details of the teachers:");
		
		for(i=0;i<count;i++)
		{
			a[i].display();
			
		}

	}

}