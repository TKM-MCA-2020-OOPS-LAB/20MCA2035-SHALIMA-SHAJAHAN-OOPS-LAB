package myproject;
import java.util.Scanner;

public class Employees {

		int Empid;
		String Name;
		float Salary;
		String Address;
		
		public Employees(int id, String name,float salary, String address ) {
			this.Empid = id;
			this.Name = name;
			this.Salary = salary;
			this.Address = address;
			
		}
		
		
	static class Teacher extends Employees{
	        String Department;
	        String Subject;
	       
	        
	        public Teacher(int id, String name, float salary, String address, String dept, String subj) {
	        super(id, name, salary, address);
				
				
			this.Department = dept;
			this.Subject = subj;
				
			}


			public void Display() {
				
				System.out.println("\Enter the id of employee: "+Empid);
				System.out.println("Name of the employee: "+Name);
				System.out.println("Salary of the employee: "+Salary);
				System.out.println("Address is : "+Address);
				System.out.println("Department is: "+Department);
				System.out.println("Subject : "+Subject);
				
			}
			
		}
		
		

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int i,count, id_;
			float sal;
			String nam,adr,dep,sub;
			

			System.out.println("Enter the number of employees :");
			count = sc.nextInt();
	        
			Teacher[] e = new Teacher[count];
	      
			
			for( i=0; i<count; i++)
				{
				
				   System.out.println("Enter the ID of the employee:");
				    id_= sc.nextInt();
				   System.out.println("Enter the name of employee:");
				    nam= sc.next();
				   System.out.println("Enter the salary:");
				    sal= sc.nextFloat();
				   System.out.println("Enter the address:");
				    adr= sc.next();
				   System.out.println("Enter the department:");
				    dep= sc.next();
				   System.out.println("Enter the subject:");
				    sub= sc.next();
		        
				   e[i] = new Teacher(id_,nam,sal,adr,dep,sub);
				
				}
			System.out.println("\ndetails of the employee");
			for( i=0; i<count; i++)
		        {
				   e[i].Display();
			    }
			
			
		}

	}