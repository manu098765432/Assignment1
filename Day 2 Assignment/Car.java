package Assignment2;

public class Car {
   int speed;
   double regprice;
	String color;
	Car(int speed,double regprice,String color) {
		this.speed=speed;
		this.regprice=regprice;
		this.color=color;
	}
	public double getSalePrice() {
		return regprice;
	}

}
