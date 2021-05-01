package myproject;

public class product {
	int pcode;
	String pname;
	int price;
	public static void main(String[] args) {
		product ob1= new product();
		product ob2= new product();
		product ob3= new product();
		ob1.pcode=56567;
		ob1.pname="vivo";
		ob1.price=55000;
		ob2.pcode=50067;
		ob2.pname="samsung";
		ob2.price=25000;
		ob3.pcode=56347;
		ob3.pname="POCO";
		ob3.price=10000;
		if (ob1.price<=ob2.price && ob1.price<=ob3.price)
			System.out.println(ob1.pname+"is cheaper");
		else if (ob2.price<=ob1.price && ob2.price<= ob3.price)
			System.out.println(ob2.pname+ "is cheaper");
		else 
			System.out.println(ob3.pname+ "is cheaper");
	
	
	}

}
