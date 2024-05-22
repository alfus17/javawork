package _03_userDefineException;

public class UserException extends Exception {
	
	public UserException() {}
	public UserException(String string) {
		super(string);
	}
}
