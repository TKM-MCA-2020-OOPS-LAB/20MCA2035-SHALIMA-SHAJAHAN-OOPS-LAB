package myproject;
public class UsernameException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int username;

	public UsernameException(int username) {
		super();
		this.username= username;
	}
	public String information() {
		
		switch (username) {
		
		case 1 :
			return("\ninvalid username the username should not contain space\n");
			
		case 2 :
			return ("\ninvalid username the username should not contain special character\n");
			
		}
		return null;
		
	}
	

}

