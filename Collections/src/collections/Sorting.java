package collections;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sorting {

	public static void main(String[] args) {
		 Employee emp1 = new Employee(1, "Aditya", "A", 20000L);
		 Employee emp2 = new Employee(3, "Kalyan", "D", 50000L);
		 Employee emp3 = new Employee(2, "Ananya", "C", 30000L);
		 Employee emp4 = new Employee(4, "Onkar", "B", 70000L);

		 System.out.println("Enter a to sort according to id "+"\n"+"Enter b to sort according to Name "
		 +"\n"+"Enter c to sort according to department "+"\n"+"Enter d to sort according to Salary ");
		 Scanner sc = new Scanner(System.in);
		 String ch = sc.nextLine();


			Set<Employee> set = new TreeSet<Employee>(new Sort(ch));

			set.add(emp1);
			set.add(emp2);
			set.add(emp3);
			set.add(emp4);

			Iterator <Employee> i= set.iterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  

	         sc.close();
	}

}
