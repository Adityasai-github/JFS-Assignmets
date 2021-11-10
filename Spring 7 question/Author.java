package spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Author {
	 @Value("#{book.title?.toUpperCase()}")
	 
	 //String title  = book.getTitle();
	 //If(title != null) {
	    // return title.toUpperCase();}
	 
	 
	 
	 
	    private String bookTitle;
	    @Value("AdityasaiMatta")
	    private String authorName;
	    @Value("#{T(java.lang.Math).PI}")
	    private double x;

	    public void show() {
	        System.out.println("Book Title : " + bookTitle);
	        System.out.println("Author Name : " + authorName);
	        System.out.println("PI Value : " + x);

}
}
