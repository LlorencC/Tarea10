package t10_5;

public class Main {

	public static void main(String[] args) {
		Password contraseña=new Password(20);
		
		System.out.println(contraseña.contra); //printing the password
		System.out.print(contraseña.esFuerte()); //call to the method esFuerte
	}

}
