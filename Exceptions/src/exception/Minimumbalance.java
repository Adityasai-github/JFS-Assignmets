package exception;

	import java.util.Scanner;

	class Minimumbalance extends Exception {

	    String message;

	    public Minimumbalance(String message) {
	        this.message = message;
	    }

	    @Override
	    public String toString() {
	        return message;
	    }
	}
	