package Assignment2;

public class Tshirt {
	String TshirtColor;
	String Tshirttype;
	String Tshirtsize;
	Tshirt(){}
	Tshirt(String Color,String type,String size){
		this.TshirtColor=Color;
		this.Tshirttype=type;
		this.Tshirtsize=size;
	}
	
	public String Size(String size) {
		return size;
		
	}
	public void display()
	{

		System.out.println(TshirtColor);
		System.out.println(Tshirttype);
		System.out.println(Tshirtsize);
		
		
	}
	public static void main(String args[])
	{
		Tshirt t1=new Tshirt("Blue","Rayon","DigitalPhoto");
		t1.display();
		System.out.println(t1.Size("small"));
		Tshirt t2=new Tshirt("Pink","Cotton","Flowers");
		t2.display();
		System.out.println(t2.Size("large"));
		Tshirt t3=new Tshirt("Black","fabric","Dog");
		t3.display();
		System.out.println(t3.Size("xtra-large"));
		
		
	}

}
