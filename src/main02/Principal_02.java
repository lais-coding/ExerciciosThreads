package main02;

import java.util.Random;

import controller02.ThreadSomaLinha;

public class Principal_02 {

	public static void main(String[] args) {
		
		int [][]matriz = new int [3][4];

		Random random = new Random();
		
		//Preenchendo a matriz com valores aleatórios
		
		for(int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				matriz[i][j] = random.nextInt(6); //Limitei os valores no random
				
			}
				
		} 
		
		System.out.println("MATRIZ");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.println(matriz[i][j]);
			}
		}
		
		Thread tSoma = new ThreadSomaLinha(matriz);
		tSoma.start();
		
		
		
	}

}
