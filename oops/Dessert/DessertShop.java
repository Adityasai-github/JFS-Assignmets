package aditya;

import java.util.Scanner;

public class DessertShop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DessertItems candy=new Candy();
		DessertItems cookies=new Cookies();
		DessertItems icecream=new IceCream();
		Owner owner=new Owner();
		Customer customer=new Customer();
		Boolean isTrue=true;
		while(isTrue) {
			System.out.println("\n\nOwner or Customer");
			System.out.println("0 to exit");
			String person=sc.nextLine();
			if(person.equalsIgnoreCase("owner")) {
				System.out.println("\n"+"owner");
				owner.addDessert(candy, cookies, icecream);
				
			}else if(person.equalsIgnoreCase("customer")) {
				customer.placeorder(candy, cookies, icecream);
			}else {
				int num=sc.nextInt();
				if(num==1) {
					isTrue=false;
				}
				
			}
		}
		sc.close();

	}

}
