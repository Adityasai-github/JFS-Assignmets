package lambda;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

 class sai implements UnaryOperator<String> {
	 public String apply(String str) {
	      return str.toUpperCase();
	   }
	}
 public class Replacelambda {
	   public static void main(String[] args) {
	      ArrayList<String> list = new ArrayList<>();
	      list.add("hi");
	      list.add("i am");
	      list.add("doing");
	      list.add("currently");
	      list.add("doing the java full stack assignments");
	      System.out.println("Contents of the list: "+list);
	      list.replaceAll(new sai());
	      System.out.println("Contents of the list after replace operation: \n"+list);
	   }

	}


