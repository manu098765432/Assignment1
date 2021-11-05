package Day3_Assignment;

 abstract class EmployeeBean {
	private int empId;
	private String empName;
	private double empSal;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName=empName;
	}
	public double getEmpSal() {
		return empSal;
		
	}
	public void setEmpSal(double empSal) {
		this.empSal=empSal;
	}

	public abstract double getSalCal(); 
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	
		
	

}
