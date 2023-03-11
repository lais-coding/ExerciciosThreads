package main00;

import controller00.ThreadVetor;

public class Principal_00 {
	
	public static void main (String args[]) {
		
		int vetor[] = {1, 3, 5, 6};
		int valor1 = 1, valor2 = 2;
		
		Thread tVetor1 = new ThreadVetor(vetor, valor1);
		tVetor1.start();
		Thread tVetor2 = new ThreadVetor(vetor, valor2); 
		tVetor2.start();
		
	
		
		
	}

}
