package myproject;
public class passwordexception extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int  password ;

public passwordexception(int Password ) {
	super();
	this.password = Password;
	
}
public String Message() {
	
	switch (password) {
	
		case 1 :
		return("!!! invalid password \n password should contain at least one special character \n");
		
		
	}
	return null;


}

}


