package t10_3;

public class NumeroRandom extends Exception {
	int mensajeOpt;
	//NumeroRandom builder
	public NumeroRandom(int res) {
		super();
		this.mensajeOpt=res;
	}
	
	//getMessage method
	public String getMessage() {
		String message="";
		
		if (this.mensajeOpt==0) { //if the number introduced is zero is "par" else is "impar" 
			message="El número es par";
		}
		else {
			message="El número es impar";
		}
		
		return message;
		
	}
}
