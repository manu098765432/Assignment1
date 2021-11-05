package Day3_Assignment;

public class Developer extends Employee{
	
	Developer(int a,String b){
		this.empId=a;
		this.empName=b;
	}
	public double SalCal(int a) {
		this.empSal=a*1;
		return this.empSal;
	}
	public static void main(String args[]) {
		//TOTO Auto-generated method stub
		Developer d1=new Developer(165,"ghg");
		d1.SalCal(100000);
		d1.display();
	}

}
