package assignment;

public class Supply {

	public static void main(String[] args) {
		int i=20;
		int j=20;
		int k=70;
		if(i>60 && j>60 && k>60)
		{
		System.out.println("passed");
		}
		else if(i>60 && j>60 || k>60 && j>60 || k>60 && i>60)
		{
		System.out.println("promoted");
		}
		else
		{
		System.out.println("failed");

	}

}
}
