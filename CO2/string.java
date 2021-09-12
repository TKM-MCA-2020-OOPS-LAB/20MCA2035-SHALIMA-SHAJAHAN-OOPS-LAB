package myproject;
import java.util.Scanner;
public class string {

	public static void main(String[] args) {
		int n;
		String temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number of strings");
		n=sc.nextInt();
		
		String str[] = new String[n];
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter the Strings");
		for(int i=0;i<n;i++)
		{
			str[i]= sc1.nextLine();
			}
		sc.close();
		sc1.close();
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++) {
				if(str[i].compareTo(str[j])>0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
			}
		}
System.out.print("Strings in Sorted Order:\n");
for(int i=0;i<n;i++)
{
	System.out.print(str[i]+"\n");
	
}


	}

}
