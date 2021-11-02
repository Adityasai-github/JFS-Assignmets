package assignment;

public class Armstrong {

	public static void main(String[] args) {
		int num=153,rem,arm=0;
		int backup=num;
		while(num>0)
		{
		rem=num%10;
		num=num/10;
		arm=arm+(rem*rem*rem);
		}
		System.out.println("Actual number is :"+backup);
		System.out.println("the individual cube and the sum result is :"+arm);
		if(backup==arm)
		System.out.println("number is armstrong");
		else
		System.out.println("number is not Armstrong");

	}

}
