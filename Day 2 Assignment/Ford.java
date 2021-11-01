package Assignment2;

public class Ford extends Car{
	int year;
	int mandiscount;
	Ford(int speed,double regprice,String color,int year,int mandiscount){
		super(speed,regprice,color);
		this.year=year;
		this.mandiscount=mandiscount;
		
	}
	public double getSalePrice() {
		return(super.getSalePrice()-mandiscount);
	}

}
