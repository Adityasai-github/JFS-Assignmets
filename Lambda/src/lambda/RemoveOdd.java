package lambda;

import java.util.ArrayList;

public class RemoveOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> students = new ArrayList<String>();

        students.add("Hari");
        students.add("Aditya");
        students.add("Anand");
        students.add("Satish");
        students.add("Sai");
        students.removeIf(n -> n.length()%2!=0);
  
        System.out.println(students);
        }

	
}


