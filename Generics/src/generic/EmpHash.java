package generic;

import java.util.HashSet;

public class EmpHash {

	public static void main(String[] args) {
		HashSet<Employee> h1=new HashSet<Employee>();
		Employee emp=new Employee(22, "Aditya",  "null", 25000, "IT");
		h1.add(emp);
		emp.display();
	}

}
