package Day3_AssignmentShape;

public class Square extends Shape{
	
	@Override
	public double area() {
		return length*length;
	}
	Square(double len)
	{
		this.length=len;
		
	}
	public static void main(String args[]) {
		Square s1=new Square(5);
		System.out.println("Area of Square= "+s1.area());
	}

}
