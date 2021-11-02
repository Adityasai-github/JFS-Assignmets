package strings;

public class Insert {

	public static void main(String[] args) {
		  StringBuffer sb1 = new StringBuffer("itisusedto at the specified index");  
          System.out.println("string1: "+sb1);  
          String c = "insert text";  
          sb1.insert(10,c);  
          System.out.println("after insert: " + sb1);
	}

}
