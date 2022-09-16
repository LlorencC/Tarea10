package t10_4;

public class Calculadora {
	
	//Calculadora default builder
	public Calculadora() {
		
	}
	
	//sumar method returns the sum of 2 numbers (parameters)
	public int sumar(int num1, int num2) {
		return num1+num2;
	}
	//restar method returns the difference of 2 numbers
	public int restar(int num1, int num2) {
		return num1-num2;
	}
	//multiplicar method returns the multiplication of 2 numbers 
	public int multiplicar(int num1, int num2) {
		return num1*num2;
	}
	//dividir method returns the division of 2 numbers 
	public int dividir(int num1, int num2) {
		return num1/num2;
	}
	//raizCuadrada method returns the square root of a number
	public double raizCuadrada(int num1) {
		return Math.sqrt(num1);
	}
	//raizCubica method returns the cubic root of a number
	public double raizCubica(int num1) {
		return Math.cbrt(num1);
	}
	//potencia method return the power of the base entered by the user
	public double potencia(int num1, int num2) {
		return Math.pow(num1, num2);
	}
	
	
}
