package collections;

import java.util.Comparator;

class Sort implements Comparator<Employee> {
	String a;

	public Sort(String a) {
		super();
		this.a = a;
	}


	@Override
	public int compare(Employee o1, Employee o2) {

		if(a.equalsIgnoreCase("a")) {
			return o1.id-o2.id;
		}else if(a.equalsIgnoreCase("b")) {
			return o1.name.compareTo(o2.name);
		}else if(a.equalsIgnoreCase("c")) {
			return o1.dept.compareTo(o2.dept);
		}else if(a.equalsIgnoreCase("d")) {

			if (o1.salary>o2.salary) {
	            return 1;
	        }
	        else if (o1.salary<o2.salary) {
	            return -1;
	        }
	        else {
	            return 0;
	        } 
		}
		return 0;	
	}	

}
