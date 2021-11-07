package lambda;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Maptostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Aditya");
		map.put(2, "Anand");
		
		Function<Map<Integer, String>, StringBuilder> function = mapValues -> {
			StringBuilder sb = new StringBuilder();
			for (java.util.Map.Entry<Integer, String> string : mapValues.entrySet()) {
				sb.append(string.getKey());
				sb.append(string.getValue());
			}
			return sb;
		};
		
		System.out.println(function.apply(map));


	}

}
