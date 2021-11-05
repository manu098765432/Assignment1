package Day3_Assignment;

public class Manager extends Employee{
	Manager(int a,String b){
		this.empId=a;
		this.empName=b;
	}
	public double SalCal(int a) {
		this.empSal=a*2;
		return this.empSal;
	}
	public static void main(String args[]) {
		//TOTO Auto-generated method stub
		Manager m1=new Manager(165,"ghg");
		m1.SalCal(100000);
		m1.display();
	}

}
