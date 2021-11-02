package aditya;

public class Bank {
	public int cash(int amt) {
		System.out.println("the cash in the bank is "+amt);
		return amt;
	}

}
class savingaccount extends Bank{
	public int cash(int amt) {
		System.out.println("the cash in the saving account is "+amt);
		return amt;
	}
}
 class currentaccount extends Bank{
	 public int cash(int amt) {
		 System.out.println("the cash in the current account is "+amt);
		 return amt;
	 }
	 
 }