package Day3_AssignmentShape;

public class Triangle extends Shape{
	
	@Override
	public double area() {
		return (width*height)/2;
	}
	Triangle(double wid,double hei)
	{
		
		this.width=wid;
		this.height=hei;
	}
	public static void main(String args[]) {
		Triangle t1=new Triangle(5,5);
		System.out.println("Area of Triangle= "+t1.area());
	}

}
