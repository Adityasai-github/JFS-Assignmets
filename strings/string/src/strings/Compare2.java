package strings;

public class Compare2 {

	public static void main(String[] args) {
		String str=("java String pool refers to collection of Strings which are stored in heap memory");
		String str1=("java string pool refers to collection of strings which are stored in heap memory");
		if(str.compareTo(str1)==0) {
			System.out.println("compared");
			
		}
		else {
			System.out.println("notcompared");
		}

	}

}
