package generic;

public class Employee {
	private int empId;
	private String empName;
	private String empDep;
	private double empSalary;
	
	public Employee(int empId,String empName,String epmDep,double empSalary, String empDep) {
		super();
		this.empId=empId;
		this.empName=empName;
		this.empDep=empDep;
		this.empSalary=empSalary;
	}
		
		public int getempId() {
			return empId;
		}
		public void setempId(int empId) {
			this.empId=empId;
		}
		public String getempName() {
			return empName;
		}
		public void setempName(String empName) {
			
		
		this.empName=empName;
		}
		public String getempDep() {
			return empDep;
		}
		public void setempDep(String empDep) {
			this.empDep=empDep;
		
		}
		public double getempSalary() {
			return empSalary;
		}
		public void setempSalary(double empSalary) {
			this.empSalary=empSalary;
		}
		public void display() {
			System.out.println("empId :"+ getempId());
			System.out.println("empName :"+ getempName());
			System.out.println( "empDep :"+ getempDep());
			System.out.println("empSalary :"+ getempSalary());
		}
}
	
