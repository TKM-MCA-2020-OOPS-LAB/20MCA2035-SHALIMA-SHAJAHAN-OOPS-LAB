package myproject;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

interface calculate
{
	void total();
	
}
class first implements calculate {
	int id1=101,quantity=2,unit_pr1=25,sum;
	String n1="A";
	@Override
	public void total()
	{
	sum=quantity*unit_pr1;
	
	}
}

class second extends first implements calculate {
	int id2=102,quantity2=1,unit_pr2=100,total1;
	String n2="B";
	DateFormat df =new SimpleDateFormat("dd/MM/yyyy");
	Date d=new Date();
	@Override
	public void total()
	{
		super.total();
		total1=quantity2*unit_pr2;
		
	}
	public void display()
	{
		System.out.println("Order No.1001\n");
		System.out.println("Date: "+df.format(d));
		System.out.println("\nProduct Id\t\t\tName\t\t\t\tQuantity\t\t\t\tUnit price\t\t\tTotal");
		System.out.println("______________________________________________________________________________________________________________________________________________________");
		System.out.println(id1+"\t\t\t\t"+n1+"\t\t\t\t"+quantity+"\t\t\t\t\t"+unit_pr1+"\t\t\t\t"+sum);
		System.out.println(id2+"\t\t\t\t"+n2+"\t\t\t\t"+quantity2+"\t\t\t\t\t"+unit_pr2+"\t\t\t\t"+total1);
		System.out.println("________________________________________________________________________________________________________________________________________________________");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\tNet. Amount"+"\t\t\t\t"+(sum+total1));
	}
	
}

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 first obj1=new first();
		second obj2=new second();
		obj1.total();
		obj2.total();
		obj2.display();
		

	}

}
