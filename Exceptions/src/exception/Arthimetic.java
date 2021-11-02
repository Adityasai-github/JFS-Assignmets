package exception;

import java.util.Scanner;

public class Arthimetic {

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the dividend number :");
	 int dividend=sc.nextInt();
	 System.out.println("enter the divisor number:");
	 int divisor=sc.nextInt();
	 int result=dividend/divisor;
	 System.out.println("the result of the operation is :"+result);

	}

}
