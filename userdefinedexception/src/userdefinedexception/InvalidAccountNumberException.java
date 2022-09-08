package userdefinedexception;

public class InvalidAccountNumberException extends Exception {
	//unchecked user defined exception
	public InvalidAccountNumberException() {
		super();
	}
	public InvalidAccountNumberException(String message) {
		super(message);
	}
	
}
