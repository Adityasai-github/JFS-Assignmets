package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream1 {

	public static void main(String[] args) {
		List<Trader> traderList = Arrays.asList(
				new Trader("O", "pune"),
				new Trader("N", "Mumbai"),
				new Trader("M", "pune"),
				new Trader("P", "Delhi")
				);
		List<Transaction> transactionList = Arrays.asList(
				new Transaction(traderList.get(0), 2000, 1000),
				new Transaction(traderList.get(1), 2011, 8000),
				new Transaction(traderList.get(2), 2011, 3000),
				new Transaction(traderList.get(3), 2003, 6000)
				);
		List<Fruit> fruitList = Arrays.asList(
				new Fruit("A", 150 , 10, "Red"),
				new Fruit("B", 90 , 30, "Blue"),
				new Fruit("C", 33 , 20, "Red"),
				new Fruit("D", 100 , 50, "Blue")
				);
		List<News> newsList = Arrays.asList(
				new News(1, "E" , "I", "Hello"),
				new News(2, "F" , "J", "Hiii"),
				new News(1, "F" , "K", "Thankyou"),
				new News(4, "H" , "L", "Welcome to"),
				new News(4, "H" , "L", "budget")
				); 
		
		
		
		//15 question
		transactionList.stream().min(Comparator.comparingInt(l-> l.value)).ifPresent(System.out::println);;
		
		
		
		//3 question
		fruitList.stream().filter(l->l.color.equalsIgnoreCase("Red")).sorted(Comparator.comparingInt(l->l.price)).forEach(l->System.out.println(l));
	     
		
		
		//12 question
				traderList.stream().forEach(l->{
					if(l.city.equals("indore")) {
						System.out.println(l.name+" belons to"+l.city);
						
					}else {
						System.out.println("exit");
					}
				});
				
				
				
				//1 question
				fruitList.stream().filter(l -> l.calories<100).forEach(l -> System.out.println(l.name));
		      
				
				
				
				//2 question         
				fruitList.stream().forEach(l -> {
					if(l.color.equals("Red")) {
						System.out.println(l.name + " is " + l.color);
					}else {
						System.out.println(l.name + " is " + l.color);
					}
					});
		        
				
				//14 question
				transactionList.stream().max(Comparator.comparingInt(l-> l.value)).ifPresent(System.out::println);;


	         
				
				//8 question
				transactionList.stream().filter(l -> l.year == 2011).sorted(Comparator.comparingInt(l-> l.value)).forEach(l -> System.out.println(l));
		       
				
				
				//10 question
		        traderList.stream().filter(l->l.city.equalsIgnoreCase("pune")).sorted(Comparator.comparing(l->l.name)).forEach(l->System.out.println(l));
		       
		        
		        //11 question
		        traderList.stream().sorted(Comparator.comparing(l->l.name)).forEach(l->System.out.println(l));
		       
		        
		        //4 question
		        newsList.stream().collect(Collectors.groupingBy(l -> l.newsId, Collectors.counting()))
			      .entrySet()
			      .stream()
			      .max(Map.Entry.comparingByValue())
			      .ifPresent(l-> System.out.println("News Id : "+ l.getKey() + " has the maxium comment i.e. :" + l.getValue()));
		       
		        
		        //6 question
		        
		        newsList.stream().collect(Collectors.groupingBy(l->l.commentByUser, Collectors.counting()))
			      .entrySet()
			      .stream()
			      .max(Map.Entry.comparingByValue())
			      .ifPresent(l-> System.out.println("User Id : "+ l.getKey() + " has did the maximum comment i.e. :" + l.getValue()));
			    
		        
		        //7 question
			       long countofcommentByUser=newsList.stream().count();
	              System.out.println("CountofcommentByUser is" +countofcommentByUser);
	          
	              //9 question 
	             traderList.stream().map(l->l.city).distinct().forEach(l->System.out.println(l));  
	
	             
	             //13 question
	             transactionList.stream().filter(l-> l.trader.city.equalsIgnoreCase("Delhi")).forEach(System.out::println);
	             
	             //5 question
	     		newsList.stream().filter(l-> l.comment.equalsIgnoreCase("Budget")).collect(Collectors.groupingBy(l -> l.comment, Collectors.counting()))
	     	    .entrySet().stream().max(Map.Entry.comparingByValue())
	     	    .ifPresent(l-> System.out.println( l.getKey() + " are arrived " + l.getValue() + " times")); 
	}
	
	
}
