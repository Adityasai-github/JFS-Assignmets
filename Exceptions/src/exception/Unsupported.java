package exception;

import java.util.Scanner;

public class Unsupported {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		 System.out.println("enter the dividend number :");
		 int dividend=sc.nextInt();
		 System.out.println("enter the divisor number:");
		 int divisor1=sc.nextInt();
		 int result=dividend/divisor1;
		 if(result>0 && result<0) {
		 System.out.println("the result of the operation is :"+result);
		 
			 
		 }

	}

}
