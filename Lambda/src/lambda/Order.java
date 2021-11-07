package lambda;

import java.util.Arrays;
import java.util.List;

public class Order {

	public static void main(String[] args) {
		List<Order1> ordersList = Arrays.asList(
				new Order1("A", 11000, "ACCEPTED"),
				new Order1("B", 12000, "COMPLETED"),
				new Order1("C", 1000, "ACCEPTED"),
				new Order1("D", 2000, "COMPLETED")
				);
		
		SortOrder orders = list ->{ for (Order1 order : list) {
			if(order.oPrice > 10000) {
				System.out.println(order);
			}
		}};
		
		 orders.sortedList(ordersList);
		
	}

}

interface SortOrder{
	public void sortedList(List<Order1> ordersList);
}

class Order1 {
	
	String oName;
	int oPrice;
	String status;
	public Order1(String oName, int oPrice, String status) {
		super();
		this.oName = oName;
		this.oPrice = oPrice;
		this.status = status;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Order Name: " + oName + "  Prics: " + oPrice + "  Status: " + status  ;

	}

}
