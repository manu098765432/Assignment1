package Assignment2;

public class Truck extends Car {
	int weight;
	Truck(int speed,double regprice,String color,int weight){
		super(speed,regprice,color);
		this.weight=weight;
	}
	double getregprice() {
		if(weight>500) {
			return super.getSalePrice()-(0.1*super.getSalePrice());
			
		}
		else {
			return super.getSalePrice();
		}
	}

}
