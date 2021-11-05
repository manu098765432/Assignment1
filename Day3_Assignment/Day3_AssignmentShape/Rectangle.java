package Day3_AssignmentShape;

public class Rectangle extends Shape{
	
	@Override
	public double area() {
		return length*width;
	}
	Rectangle(double len,double wid)
	{
		this.length=len;
		this.width=wid;
	}
	public static void main(String args[]) {
		Rectangle r1=new Rectangle(5,5);
		System.out.println("Area of Rectangle= "+r1.area());
	}

}
