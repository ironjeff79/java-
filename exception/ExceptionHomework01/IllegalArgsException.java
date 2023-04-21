package exception;

/*
自定义异常 
*/
public class IllegalArgsException extends Exception{
	public IllegalArgsException() {
		
	}
	
	public IllegalArgsException(String s) {
		super(s);
	}
}
