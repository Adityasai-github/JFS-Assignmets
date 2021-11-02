package aditya;

import java.util.Scanner;

public class Owner {
	public void addDessert(DessertItems candy, DessertItems cookies, DessertItems icecream) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Add Dessert :");
		Boolean isTrue=true;
		while(isTrue) {
			System.out.println("enter the number of candies to add :");
			candy.numOfDesert +=sc.nextInt();
			System.out.println("enter the number of cookies to add :");
			cookies.numOfDesert +=sc.nextInt();
			System.out.println("enter the number of icecream to add :");
			icecream.numOfDesert +=sc.nextInt();
			System.out.println("enter 0 to add more and 1 if completed :");
			int num=sc.nextInt();
			if(num==1) {
				isTrue=false;
			}
			System.out.println("Added successfully");
			
		}
	}

}
