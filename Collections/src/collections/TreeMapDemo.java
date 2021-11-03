package collections;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		Contact obj1 = new Contact( 9020304050L, "Aditya" , "A@gmail.com" , "Male");
		Contact obj2 = new Contact( 9768595385L, "Pawan kalyan" , "pk@gmail.com" , "Male");
		Contact obj3 = new Contact( 9020367494L, "Charank" , "ck@gmail.com" , "Female");

		Map<Long, Contact> data = new TreeMap<Long, Contact>(Collections.reverseOrder());
		
		data.put(1234L, obj1);
		data.put(123456780L, obj2);
		data.put(1238244L, obj3);

		 System.out.println("Keys : "+data.keySet() + "\n");
		 System.out.println("Values : " + data.values() + "\n");
		 System.out.println(data + "\n");
	}
}