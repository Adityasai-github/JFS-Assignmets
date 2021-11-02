package aditya;

public class Employee {
	public int salary(int amt) {
		System.out.println("salary of employee is "+amt);
		return amt;
	}

}
class manager extends Employee{
	public int salary(int amt) {
		System.out.println("incentive of manager is "+amt);
		return amt;
	}
}
class labour extends Employee{
	public int salary(int amt) {
		System.out.println("overtome of labour is "+amt);
		return amt;
	}
}