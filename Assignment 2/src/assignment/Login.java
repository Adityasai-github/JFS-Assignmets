package assignment;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String userId ="Aditya";
		String password="12345";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your username");
		String enterUserId=sc.nextLine();
		System.out.println("enter your password");
		String enteredpass=sc.nextLine();
		if(userId.equals(enterUserId))
		{
			for(int i=0;i<3;i++)
			{
				if(password.equals(enteredpass)) {
					System.out.println();
					System.out.println("login succesfull");
					break;
				}
				else {
					if(i==2) {
						System.out.println();
						System.out.println("contact admin");
						break;
					}
					System.out.println("wrong password enter again");
					enteredpass=sc.nextLine();
					
				}
			}
		}
		else {
			System.out.println("wrong user name");
		}
		
	}
}

