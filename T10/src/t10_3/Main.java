package t10_3;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random alea=new Random(System.currentTimeMillis());
		int num;
		
		try {
			num=alea.nextInt(999);
			System.out.println(num);
			throw new NumeroRandom(num%2); //we give the remainder result of the division between the random number and 2
			
		} catch (NumeroRandom e) {
			System.out.print(e.getMessage()); //we show the message determinated by the number given in the throw declaration
		}

	}

}
