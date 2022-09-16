package t10_4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner key=new Scanner(System.in);
		int opcion, num1, num2;
		double calculo = 0;
		Calculadora calcu=new Calculadora();
		
		try {
			System.out.print("1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Raíz cuadrada\n6. Raíz cúbica\n7. Potencia\n8. Salir\nIntroduce una opción: ");
			opcion=key.nextInt();
			System.out.print("Introduce el número deseado: ");
			num1=key.nextInt();
			switch (opcion) {
				case 1: //addition
					num2=key.nextInt();
					calculo=calcu.sumar(num1, num2);
					break;
				case 2: //substraction
					num2=key.nextInt();
					calculo=calcu.restar(num1, num2);
					break;
				case 3: //multiplication
					num2=key.nextInt();
					calculo=calcu.multiplicar(num1, num2);
					break;
				case 4: //division
					num2=key.nextInt();
					calculo=calcu.dividir(num1, num2);
					break;
				case 5: //square root
					calculo=calcu.raizCuadrada(num1);
					break;
				case 6: //cube root
					calculo=calcu.raizCubica(num1);
					break;
				case 7: //power
					num2=key.nextInt();
					calculo=calcu.potencia(num1, num2);
					break;
				default:
					if (opcion!=8) {
						System.out.print("ERROR! Opción inválida!");
					}
					System.out.print("Saliendo...");
			}
			if (opcion<8) {
				System.out.print("El resultado es: "+calculo);
			}
			
		} catch (InputMismatchException ex) {
			System.out.print(ex);
		} catch (ArithmeticException ex) {
			System.out.print(ex);
		} catch (NumberFormatException ex) {
			System.out.print(ex);
		}
		
		key.close();
	}

}
