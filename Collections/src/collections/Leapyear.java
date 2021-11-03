package collections;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;

public class Leapyear {

	public static void main(String[] args) {
		Date date = new Date("26/10/1999");
		Date date1 = new Date("26/10/2000");
		Date date2 = new Date("01/10/2001");
		Date date3 = new Date("10/10/2002");
		Date date4 = new Date("10/10/2003");
		Date date5= new Date("10/10/2012");
		Date date6 = new Date("10/10/2020");
		
		List<Date> lis = new LinkedList<>();
		lis.add(date);
		lis.add(date1);
		lis.add(date2);
		lis.add(date3);
		lis.add(date4);
		lis.add(date5);
		lis.add(date6);
		 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		for (int i = 0; i < lis.size(); i++) {
			
			LocalDate ld= LocalDate.parse(lis.get(i).date,df);
			String sd=(ld).format(df);
			  
			if(ld.getYear() % 4 == 0) {
				System.out.println(sd + " is an leap year");
			}else {
				System.out.println(sd + " is not an leap year");
			}
		}
		
	}
}


class Date {
	
	String date;
	
	public Date(String date) {
		super();
		this.date = date;
	}

	@Override
	public String toString() {
		return "[date=" + date + "]";
	}

	public String getDate() {
		return date;
	}
	 


	}

