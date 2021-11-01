package Assignment2;
public class StudAssign {
	int stdId;
	String stdName;
	double stdMarks;
	
	StudAssign(){}
	
	StudAssign(int id,String Name,double Marks){
		this.stdId=id;
		this.stdName=Name;
		this.stdMarks=Marks;
		
	}
	public void display() {
		System.out.println(stdId);
	
	}

	public double Marks(double c,double java) {
		return this.stdMarks+c+java;
		
	}
	public static void main(String args[]) {
		StudAssign s1=new StudAssign(54,"manasa",50);
		s1.display();
		System.out.println(s1.Marks(20,50));
		System.out.println(s1.stdName);
		
	}

}




