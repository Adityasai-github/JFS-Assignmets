package aditya;

public class Singletone {
	private static Singletone createInstance=new Singletone();
	private Singletone() {
		
	}
	public static Singletone getInstance() {
		return createInstance;
		
	}
	public void name() {
		System.out.println("Adityasai Matta");
	}
	
}
