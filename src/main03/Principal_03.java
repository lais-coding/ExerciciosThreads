package main03;

import controller03.ThreadCorrida;
import java.util.Random;

public class Principal_03 {
	
	public static void main (String args[]) {
		
		//Declaração de random para gerar números aleatórios de tamanhos de saltos dos sapos
		 Random random = new Random ();
		
		
		//Definição dos pulos dos sapos
		 int puloPrimeiroSapo = 10;
		 int puloSegundoSapo = 10;
		 int puloTerceiroSapo = 10;
		 int puloQuartoSapo = 10;
		 int puloQuintoSapo = 10;
		 
		 System.out.println("**** CORRIDA DE SAPOS ******");
			System.out.println("DISTANCIA MAXIMA: 50 METROS");
			System.out.println("SAPO 1 \n PULO: " +puloPrimeiroSapo+ " METROS");
			System.out.println("SAPO 2 \n PULO: " +puloSegundoSapo+ " METROS");
			System.out.println("SAPO 3 \n PULO: " +puloTerceiroSapo+ " METROS");
			System.out.println("SAPO 3 \n PULO: " +puloQuartoSapo+ " METROS");
			System.out.println("SAPO 3 \n PULO: " +puloQuintoSapo+ " METROS");
			
			
			System.out.println("START!");
			System.out.println(".................................");
			
		
			Thread Start = new ThreadCorrida(puloPrimeiroSapo, puloSegundoSapo, puloTerceiroSapo,  puloQuartoSapo, puloQuintoSapo);
			Start.start();
		
	}

}
