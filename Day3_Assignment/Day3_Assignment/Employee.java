package Day3_Assignment;

public class Employee {
	int empId;
	String empName;
	double empSal;
	Employee(){}//empty constructor
	
    Employee(int a,String b){
    	this.empId=a;
    	this.empName=b;
    }
    public double SalCal(int a) {
    	this.empSal=a;
    	return this.empSal;
    }
    public void display() {
    	System.out.println("EmpId: "+empId);
    	System.out.println("EmpName: "+empName);
    	System.out.println("EmpSal: "+empSal);
    	System.out.println();
    }
    public static void main(String args[]) {
    	Employee e1=new Employee(276,"manasa");
    	e1.SalCal(1000);
    	e1.display();
    }
}
