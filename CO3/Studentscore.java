package myproject;
import java.util.Scanner;

class Student {
	int id;
	String nam;
	int acadmarks;
	Student()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student id:");
		id=s.nextInt();
		System.out.println("Enter the student name:");
		nam=s.next();
		System.out.println("Enter student's mark:");
		acadmarks=s.nextInt();
		
		
	}
}
class Sports extends Student {
	String Category;
	int Sportsmark;
	Sports()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name of  sports  Category : ");
		Category=s.nextLine();
		System.out.println("Enter the Sport's score;");
		Sportsmark=s.nextInt();
		
	}
}
class Result extends Sports {
	int Total;
	Result() {
		Total=acadmarks+Sportsmark;
		
	}
	
	void display() {
		
		System.out.println("....Academic details.....");
		System.out.println("Student id:" +id);
		System.out.println("student name:"+nam);
		System.out.println("Academic score:"+acadmarks);
		System.out.println(".....Sports details....");
		System.out.println("Sports Category:"+Category);
		System.out.println("Sports Score:"+Sportsmark);
		System.out.println("Total Score:"+Total);
		System.out.println("   .");
		
	}
	
	
	
}
public class Studentscore {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=s.nextInt();
		Result r[]=new Result[n];
		
		for(int i=0;i<n;i++)
		{
			r[i]=new Result();
			
		}
		for(int i=0;i<n;i++)
		{
			r[i].display();
			
		}

	}

}
