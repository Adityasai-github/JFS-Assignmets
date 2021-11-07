package streams;

public class Trader {
	String name;
	String city;
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		 
		return name+" "+ city;
	}
	
}
class Transaction{
	Trader trader;
	int year;
	int value;
	public Transaction(Trader trader, int year, int value) {
		super();
		this.trader = trader;
		this.year = year;
		this.value = value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		  return trader.name +" "+year+ " " +value ;
	}
	
}
 class Fruit {
	String name;
	int calories;
	int price;
	String color;
	public Fruit(String name, int calories, int price, String color) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
		@Override
		public String toString() {
			return "Fruit name is " +name+ ", calories is " +calories+ ",price is "+price+ ", and the color is " +color;
		
	}
 }
	


 class News{
		int newsId;
		String postedByUser;
		String commentByUser;
		String comment;
		public News(int newsId, String postedByUser, String commentByUser, String comment) {
			super();
			this.newsId = newsId;
			this.postedByUser = postedByUser;
			this.commentByUser = commentByUser;
			this.comment = comment;
		}
		@Override
		public String toString() {
			return "the newsid is" +newsId+ ", posted by "+postedByUser+ ", comment by "+commentByUser+ ", comment is "+comment;
		
	}
 }


