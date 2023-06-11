class shapes
{
	void area(int x)
	{
		System.out.println("Area of squares:" + x*x);
	}
	void area(int a,int b)
	{
		System.out.println("Area of rectangle:" + (a*b));
	}
	void area(double r)
	{
		System.out.println("Area of Circle:" + r*r*3.14);
	}
}
class overload_10
{
	public static void main(String[] a)
	{
		shapes s=new shapes();
		s.area(5);
		s.area(6,10);
		s.area(4.00);
		
	}
	
}
		