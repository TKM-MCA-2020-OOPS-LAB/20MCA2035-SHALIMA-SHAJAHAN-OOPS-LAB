package myproject.graphics;

interface calculate
{
	int rectangle(int l, int b);
	double triangle(double b1, double h);
	int square(int s);
	double circle(double r);
	
}

public class figures implements calculate
{


	int rect_area,sqr_area ;
	double circle_area,tri_area;
	
	@Override
	public int rectangle(int l, int b)
	{
		rect_area = l * b;
		System.out.println("Area of rectangle : " +rect_area);
		return rect_area;
		
	}
	@Override
	public double triangle(double b1, double h) 
	{
		tri_area = ((b1*h)/2);
		System.out.println("Area of triangle : " +tri_area);
		return tri_area;
		
	}
	@Override
	public int square(int s)
	{
		sqr_area = s * s;
		System.out.println("Area of square : " +sqr_area);
		return sqr_area;
		
	}
	@Override
	public double circle(double r)
	{
		circle_area = 3.14 * r * r;
		System.out.println("Area of circle : " +circle_area);
		return circle_area;
		
	}
	
}
