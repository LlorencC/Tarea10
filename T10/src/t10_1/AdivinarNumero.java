package t10_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinarNumero {

	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		int numUser;
		boolean correcto=false;
		NumeroRandom numRandom=new NumeroRandom();
		//System.out.print(numRandom.numeroAlea);
		
		do {
			try {
				do {
					System.out.print("Introduce un número entre 1 y 500: "); 
					numUser=key.nextInt();
					//checking if the random number given by the object is bigger or not than the number given by the user
					if (numRandom.numeroAlea>numUser) { 
						System.out.println("El número que buscas es más grande."); 
					}
					else if (numRandom.numeroAlea!=numUser) {
						System.out.println("El número que buscas es más pequeño."); 
					}
					numRandom.cont++; //we plus one to the counter every time that the loop is executed
				} while (numRandom.numeroAlea!=numUser); //while the user number isn't like the random number keep looping
				System.out.print("¡CORRECTO! Lo has adivinado en "+numRandom.cont+" intentos"); 
				correcto=true;
			}
			catch (InputMismatchException e) {
				System.out.println(e);
				System.out.println("Introduce un valor válido.");
				key.next();
			}
		} while (!correcto);
		
		key.close();
	}

}
