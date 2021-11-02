package exception;

import java.util.Scanner;

public class UserDefinedException {

		    static double current_balance = 1000;
		    static double deposit_amount = 1000;
		    static double bank_id = 123456789;

		    public static void main(String[] args) throws Minimumbalance {
		        Scanner s = new Scanner(System.in);
		        System.out.println("the current balance is :"+current_balance);
		        System.out.println("the bank id is :"+bank_id);
		        System.out.println("Enter amount to withdrawal");
		        int n = s.nextInt();
		        try {
		            if (current_balance < n) {
		                throw new Minimumbalance("Insufficient funds ! your Current balance is " + current_balance);
		            }else if(n<0)
		            	System.out.println("illegal transaction and unable to withdraw and your current balance" +current_balance);
		            else {
		                System.out.println("Please Take The Money : " + n);
		            }

		        } catch (Minimumbalance mab) {
		            mab.printStackTrace();
		        }
		    }

	}
