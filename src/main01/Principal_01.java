package main01;

import java.util.Random;
import controller01.OpThreads;

public class Principal_01 {
	
	public static void main(String[] args) {
			
		Random random = new Random();
		int n1 = random.nextInt(10); //Entrada com valores aleatórios de 0 a 10
		int n2 = random.nextInt(10); 
		int resultado = 0;
		
		//CHAMADA DE THREADS
		
		Thread OpThread = new OpThreads(n1, n2);
		OpThread.start();
		
	}

}
