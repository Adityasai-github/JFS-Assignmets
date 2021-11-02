package aditya;

public class Mattapersist {

	public static void main(String[] args) {
		Persistance p1=new FilePersistance();
		Persistance p2=new DataPersistance();
        p1.persist();
        p2.persist();
	}

}
