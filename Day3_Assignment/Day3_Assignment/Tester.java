package Day3_Assignment;

public class Tester extends Employee{
	
	Tester(int a,String b){
		this.empId=a;
		this.empName=b;
	}
	public double SalCal(int a) {
		this.empSal=a*2;
		return this.empSal;
	}
	public static void main(String args[]) {
		//TOTO Auto-generated method stub
		Tester t1=new Tester(165,"ghg");
		t1.SalCal(100000);
		t1.display();
	}

}
