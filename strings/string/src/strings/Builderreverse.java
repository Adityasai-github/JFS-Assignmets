package strings;

public class Builderreverse {

	public static void main(String[] args) {
		StringBuilder sbf = new StringBuilder("This method returns the reversed object on which it was called");
        System.out.println("String builder = " + sbf);
          
        sbf.reverse();
        System.out.println("String builder after reversing = " + sbf);

	}

}
