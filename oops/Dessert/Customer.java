package aditya;

import java.util.Scanner;

public class Customer { 
	int noOfCandy,noOfCookies,noOfIcecream;
	public void placeorder(DessertItems candy,DessertItems cookies,DessertItems icecream) {
		Scanner sc=new Scanner(System.in);
		System.out.println("");
		Boolean isTrue=true;
		while(isTrue) {
			System.out.println("select your order :"+"\n"+"1. Candy(60rs)"+"\n"+"2. cookies(50)"+"\n"+"3. Icecream(70)"+"\n"+"press 1 for candy,2 for cookies, 3 for icecream"+"\n");
			int selected=sc.nextInt();
			switch (selected) {
			case 1:{
				System.out.println("enter the number of candies to add :");
				noOfCandy=sc.nextInt();
				cookies.numOfDesert-=noOfCandy;
				break;
				
			}case 2:{
				System.out.println("enter the number of cookies to add :");
				noOfCookies=sc.nextInt();
				cookies.numOfDesert-=noOfCookies;
				break;
			}case 3:{
				System.out.println("enter the number of icecream to add :");
				noOfIcecream=sc.nextInt();
				cookies.numOfDesert-=noOfIcecream;
				break;
				
			}default:
				System.out.println("wrong option");
			}
			System.out.println("enter 1 to select and 0 to if exit :");
			int num=sc.nextInt();
			if(num==0) {
				isTrue=false;
			}
		}
		System.out.println("added successfully");
		showOrder(candy.getCost(),cookies.getCost(),icecream.getCost());
		
	}
	public void showOrder(int a,int b,int c) {
		System.out.println("your order is :"+"\n"+"Desserts "+"Qty "+"Amount"+"\n"+"1.candy "+noOfCandy+"  "+(a*noOfCandy)+"\n"+"2.Cookies "+noOfCookies+"  "+(b*noOfCookies)+"\n"+"3. Icecream "+noOfIcecream+"  "+(c*noOfIcecream)+"\n"+"------------------------"+"\n"+"Total bill"+"    "+((a*noOfCandy)+(b*noOfCookies)+(c*noOfIcecream)));
		
	}

}
