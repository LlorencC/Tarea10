package t10_1;

import java.util.Random;
import java.util.Random;

public class NumeroRandom {
	Random alea=new Random(System.currentTimeMillis());
	protected int numeroAlea, cont;
	//NumeroRandom builder
	public NumeroRandom() {
		numeroAlea=alea.nextInt(500)+1; //random number between 1 and 500
		cont=0; //a counter to save all tries of the user to guess the random number
	}
}
