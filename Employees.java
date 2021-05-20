	package myproject;

		import java.util.Scanner;

		public class Employees {
			int Empid;
			String name;
			double salary;
			String address;
		public Employees (int id,String nam,double sal,String adr)
			{
				this.Empid = id;
				this.name = nam;
				this.salary = sal;
				this.address = adr;
				
			}
			static class teacher extends Employees{
				
			
			   
				String department;
				String Subject;
				
		   public teacher(int id, String nam, double sal, String adr, String dept, String sub)
		   {
			super(id, nam, sal, adr);
		
			this.department=dept;
			this.Subject=sub;
			
		}
			
			
			public void display()
			{
				System.out.println("Employee details...");
				System.out.println("employee id .. " +Empid);
				System.out.println("Name of the Employee.. " +name);
				System.out.println("Salary of the Employee .. " +salary);
				System.out.println("Adress is " +address);
			
				System.out.println("Department of the teacher.. "+department);
				System.out.println("Subject of the teacher.." +Subject);
			}
		
			
			public static void main(String[] args) {
			
				
					// TODO Auto-generated method stub
					int id ,no,i;
					String nam, adr,sub, dept;
					double sal;
					Scanner sc=new Scanner(System.in);
					System.out.println("enter the number of employees :");
					no=sc.nextInt();
				 
					teacher []e = new teacher [no];
					for ( i = 0; i<no; i++)
					{
						System.out.println("Enter the id of employee");	
						id= sc.nextInt();
						System.out.println("Name of the employee");
						nam=sc.nextLine();
						System.out.println("Salary of employee");
						sal=sc.nextDouble();
						System.out.println("Address of employee");
						adr=sc.nextLine();
						
						System.out.println("enter the department");
						dept=sc.nextLine();
						System.out.println("Subject ");
						sub=sc.nextLine();
						
						e[i] = new teacher(id,nam,sal,adr,dept,sub);
						
				}	
					System.out.println("\nEmployee details :");
					for(i=0;i<no;i++)
					{
						e[i].display();
					}
					
							
					
		} }
			
			
			
	
			
			
			
		}
				