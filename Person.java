package myproject;

import java.util.Scanner;


public class Person {
	
	String Name;
	String Address;
	String Gender;
	int Age;
	
	public Person(String nam,String gen, String adr, int age) {
		Name=nam;
		Gender=gen;
		Address=adr;
		Age=age;
	}
	
	static class Employee extends Person
	{
		int Empid;
		String company_name;
		String Qualification;
		double Salary;
		
		public Employee(String nam,String gen,
				String adr, int age,int id,String cname,String qu, double sal)
		{
			super(nam,gen,adr,age);
			Empid=id;
			company_name=cname;
			Qualification=qu;
			Salary=sal;
			
		}
		static class Teacher extends Employee
		{
			int teacher_id;
			String department;
			String subject;
			
			
			public Teacher(String nam,String gen, String adr, int age,int id,String cname,String qu,
				double sal,int tid,String dept,String sub) {
				super(nam,gen,adr,age,id,cname,qu,sal);
				teacher_id=tid;
				department=dept;
				subject=sub;
				
				
			}
			void display()
			{
				System.out.println("....Personal details...");
				System.out.println("Person name:"+Name);
				System.out.println("Gender:"+Gender);
				System.out.println("Address:"+Address);
				System.out.println("Age:"+Age);
				System.out.println("...Employee details....");
				System.out.println("Employee id:"+Empid);
				System.out.println("Company Name:"+company_name);
				System.out.println("Salary of employee"+Salary);
				System.out.println("Qualification"+Qualification);
				System.out.println("...Teacher's details...");
				System.out.println("Teacher id:"+teacher_id);
				System.out.println("Department:"+department);
				System.out.println("Subject:"+subject);
				
			}
		}
		
	

	public static void main(String[] args) {

		int i,count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of person:");
		count=sc.nextInt();
		
		Teacher t[]=new Teacher[count];
		
		for(i=0;i<count;i++)
		{
			System.out.println("Enter the person name:");
			String nam1=sc.next();
			System.out.println("Enter the Gender: ");
			String gen1=sc.next();
			System.out.println("Enter the Address: ");
			String adr1=sc.next();
			System.out.println("Enter the Age:");
			int age1=sc.nextInt();
			System.out.println("Enter the Employee id: ");
			int id1=sc.nextInt();
			System.out.println("Enter the Company name: ");
			String cname1=sc.next();
			System.out.println("Enter the Salary:");
			double sal1=sc.nextDouble();
			System.out.println("Enter the  Qualification:");
			String qu1=sc.next();
		
			System.out.println("Enter the Teacher id: ");
			int tid1=sc.nextInt();
			System.out.println("Enter the  Department:");
			String dept1=sc.next();
			System.out.println("Enter the Subject:");
			String sub1=sc.next();
			
			t[i]=new Teacher(nam1,gen1,adr1,age1,id1,cname1,qu1,sal1,tid1,dept1,sub1);
		
			
		}
		for(i=0;i<count;i++)
		{
			t[i].display();
			
		}
		
		

	}

}
}
