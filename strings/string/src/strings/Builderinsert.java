package strings;

public class Builderinsert {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("itisusedto at the specified index");  
        System.out.println("string1: "+sb1);  
        String c = "insert text";  
        sb1.insert(10,c);  
        System.out.println("after insert: " + sb1);

	}

}
