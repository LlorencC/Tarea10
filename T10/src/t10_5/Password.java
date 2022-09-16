package t10_5;

public class Password {
	protected int longitud;
	protected String contra;
	private final int defaultLongitud=8;
	//default Password builder
	public Password() {
		longitud=defaultLongitud;
	}
	//Password builder with the length entered by the user and the password generated randomly
	public Password(int longitud) {
		this.longitud=longitud;
		contra=generarPassword(this.longitud);
	}
	//generarPassword method generates a random password with the length entered by the user
	public String generarPassword(int longitud) {
		String contraseña="";
		for (int i=0; i<longitud; i++) {
			int opcion=(int) (Math.random()*3); //generating a random number between 0 and 2 to select if we are going to introduce a upper case, a number or a lower case
			
			if (opcion==0) { //uppercase
				char mayus=(char) ((int) (Math.random()*(90+1-65))+65);
				contraseña+=mayus;
			}
			else if (opcion==1) { //lowercase
				char minus=(char) ((int) (Math.random()*(122+1-97))+97);
				contraseña+=minus;
			}
			else { //number
				char numero=(char) ((int) (Math.random()*(57+1-49))+49);
				contraseña+=numero;
			}
		}
		
		return contraseña;
	}
	
	//esFuerte method returns true or false depending of the conditions
	public boolean esFuerte() {
		boolean fuerte=false;
		int contNum=0, contMin=0, contMay=0;
		for (int i=0; i<contra.length(); i++) { //depending of the type of char (number, uppercase, lowercase) we increment the variable cont of the respective type of char
			if (contra.charAt(i)>=65 && contra.charAt(i)<=90 ) {
				contMay++;
			}
			else if (contra.charAt(i)>=97 && contra.charAt(i)<=122) {
				contMin++;
			}
			else {
				contNum++;
			}
		}
		
		if (contNum>5 && contMay>2 && contMin>1) { //if the pass accomplish the requirements
			fuerte=true;
		}
		
		return fuerte;
	}
	
	//set methods
	public void setLongitud(int longitud) {
		this.longitud=longitud;
	}
	
	//get methods
	public String getContra() {
		return contra;
	}
	
	public int getLongitud() {
		return longitud;
	}
}
