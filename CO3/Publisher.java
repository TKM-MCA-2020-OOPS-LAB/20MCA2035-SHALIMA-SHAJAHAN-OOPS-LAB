package myproject;

import java.util.Scanner;

import myproject.Publisher.Book.Literature.Fiction;
public class Publisher 
{
	String publisher;
	
	public Publisher(String pub){
		publisher = pub;
	}
	static class Book extends Publisher{
		String name;
		String author;
		int price;
	
		public Book(String pub,String n,String a,int p) {
			super(pub);
			name = n;
			author = a;
			price = p;
			
		}
		
		static class Literature extends Book {
			
			public Literature(String pub, String n, String a, int p) 
			{
				super(pub, n, a, p);
				
			}
			
			void Display()
			{
				System.out.println("Literature Books: ");
				System.out.println("Name of the Book: " +name);
				System.out.println("Author of the Book: " +author);
				System.out.println("Publisher of the Book: " +publisher);
				System.out.println("Price of the Book : " +price);
			}
		
			
		static class Fiction extends Book
		{

			public Fiction(String pub, String n, String a, int p)
			{
				super(pub, n, a, p);
				
			}
			
			void Display()
			{
				System.out.println("Fiction Books: ");
				System.out.println("Name of the Book: " +name);
				System.out.println("Author of the Book: " +author);
				System.out.println("Publisher of the Book: " +publisher);
				System.out.println("Price of the Book : " +price);
			}
			
		}
			
		}
		
	
	public static void main(String[] args)
	{
		int i,count1,count2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Literature Books : ");
		count1 = sc.nextInt();
		Literature l[] = new Literature[count1];
			
		for(i=0;i<count1;i++)
		{
			System.out.println();
			
			System.out.println("Enter the name of the book : ");
			String n1 = sc.next();
			System.out.println("Enter the author's name : ");
			String a1 = sc.next();
			System.out.println("Enter the publisher's name : ");
			String p1 = sc.next();
			System.out.println("Enter the price : ");
			int price1 = sc.nextInt();
			
			l[i] = new Literature(n1,a1,p1, price1);
		}
		
		
		System.out.println("Enter the number of Fiction books : ");
		count2 = sc.nextInt();
		Fiction f[] = new Fiction[count2];
		
		for(i=0;i<count2;i++)
		{
			System.out.println();
			
			System.out.println("Enter the name of the book : ");
			String n2 = sc.next();
			System.out.println("Enter the author's name : ");
			String a2 = sc.next();
			System.out.println("Enter the publisher's name : ");
			String p2 = sc.next();
			System.out.println("Enter the price of the book : ");
			int price2 = sc.nextInt();
			
			f[i] = new Fiction(n2,a2,p2,price2);
		}
		
			 System.out.println("Choose from:\n 1.Literature\n 2.Fiction ");
			 int choice = sc.nextInt();
			 
			 if(choice == 1)
			 {
				for(i=0;i<count1;i++)
				l[i].Display(); 
			 }
			
			 else if(choice == 2)
			 {
				 for(i=0;i<count2;i++)
				 f[i].Display();
			 }
		
			 else
			 {
				 System.out.println("Invalid choice");
			 }
	}

	}

}