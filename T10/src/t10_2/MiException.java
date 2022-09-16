package t10_2;

public class MiException extends Exception {
	String exceptionText="Esto es un objeto ";
	//MiException exception builder
	public MiException() {
		super();
		System.out.print(exceptionText);
	}
}
