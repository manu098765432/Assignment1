package Assignment2;

public class Sedan extends Car {
	int length;
    Sedan(int speed,double regprice,String color,int length){
    	super(speed,regprice,color);
    	this.length=length;
    }
   public double getSalePrice() {
    	if(length>20) {
    		return super.getSalePrice()-(0.2*super.getSalePrice());
    		
    	}
    	else {
    		return super.getSalePrice()-(0.1*super.getSalePrice());
    	}
    }
}

