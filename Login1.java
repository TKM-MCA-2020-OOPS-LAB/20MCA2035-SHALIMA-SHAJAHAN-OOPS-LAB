package myproject;

import java.util.Scanner;
 
public class Login1 {
 
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String username;
	 String password;
	 
	 System.out.println("Please enter the user name:");
	 username=sc.nextLine();
	 
	 try {
		 usernameauthentication(username);
		 System.out.println("successfully entered\n ");
		 
	 }
	 catch(UsernameException e) {
		 System.out.println("Something went wrong"+e.information());
	 }
	 System.out.println("Enter the password: ");
	 password=sc.next();
	 
	 try {
		 passwordauthentication(password);
		 System.out.println("Successfully entered ");
	 }
	 catch(passwordexception a) {
		 System.out.println("Wrong password "+a.Message());
	 }
 }
 
   private static void usernameauthentication(String username)
		   throws UsernameException {
	   if(username.contains(" ")) {
		   throw new UsernameException (1);
		   
	   }
	   if(username.contains("@")||username.contains("#"))
	   {
		   throw new UsernameException(2);
		   
	   }
	   
   }
   private static void passwordauthentication(String password)
		   throws passwordexception {
	   
	   
	   if(!(password.contains("@")||password.contains("#")||password.contains("$")
			   ||password.contains("%")||password.contains("^")||password.contains("&")||password.contains("*")))
	   {
		   throw new passwordexception (1);
		   
	   }
	   
   }
   
}
