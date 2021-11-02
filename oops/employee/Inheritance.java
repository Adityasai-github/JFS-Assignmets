package aditya;

public class Inheritance {

	public static void main(String[] args) {
		int total=0;
		Employee a= new Employee();
		total+=a.salary(1000);
		a=new manager();
		total+=a.salary(10000);
		a=new labour();
		total+=a.salary(700);
		System.out.println("-------------------------------------------------------------------------------");
		System.out.println("total salry of the employees is "+total);
		
	}

}
