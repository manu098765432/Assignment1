package Assignment2;

public class MyOwnAutoShop {
	int speed;
	double regprice;
	String color;
	int year;
	int mandiscount;
	public static void main(String args[]) {
		Sedan S=new Sedan(200,4000,"white",5);
		Ford F=new Ford(100,2000,"Black",1999,10);
		Truck T=new Truck(500,1000,"Red",5);
		System.out.printf("Sedan price "+S.getSalePrice());
		System.out.printf("Ford price"+F.getSalePrice());
		System.out.printf("Truck price"+T.getSalePrice());
	}

}
