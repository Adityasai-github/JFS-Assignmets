package aditya;

abstract class Persistance {
public abstract void persist();
}
class FilePersistance extends Persistance{
	@Override
	public void persist() {
		System.out.println("data is stored in the file");
	}
}
class DataPersistance extends Persistance{

	@Override
	public void persist() {
	 System.out.println("data is stored in the database");
		
	}
	
}