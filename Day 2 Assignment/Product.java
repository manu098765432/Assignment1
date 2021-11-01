package Assignment2;

public class Product {
	int proid;
	String proname;
	double proprice;
	Product(){}
	Product(int id,String name,double price){
		this.proid=id;
		this.proname=name;
		this.proprice=price;
		
	}
	public void display() {
		System.out.println(proid);
	}
	public double totalprice(double sal,double GST) {
		return this.proprice+GST;
		
	}
	public static void main(String args[]) {
		Product p1=new Product(123,"uhh",5);
		p1.display();
		System.out.println(p1.totalprice(20,5));
	}
}
