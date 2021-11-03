package collections;

public class Contact {
	 long phone;
	 String name;
	 String email;
	String gender;
	public Contact(long phone,String name,String email,String gender){
		super();
		this.phone=phone;
		this.name=name;
		this.email=email;
		this.gender=gender;
}


	public String toString() {
	return"[number="+phone +",name="+name +",email="+email+",gender="+gender+ "]"+"\n";	
	}
}


