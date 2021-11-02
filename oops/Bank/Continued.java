package aditya;

public class Continued {

	public static void main(String[] args) {
		int total=0;
		Bank b= new Bank();
		total+=b.cash(0);
		b=new savingaccount();
		total+=b.cash(60000);
		b=new currentaccount();
		total+=b.cash(15000);
		System.out.println("--------------------------");
		System.out.println("the total cash amount in the bank is:"+total);
	}		
	
}
