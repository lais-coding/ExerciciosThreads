package controller03;

import java.util.Random;

public class ThreadCorrida extends Thread {

	//Definição da distância máxima
		static int distanciamax = 50;
		
		//Variável que vai nos mostrar a colocação do sapo, assim que finalizar a corrida
		static int colocacao = 0;
		
	
private int puloPrimeiroSapo, puloSegundoSapo, puloTerceiroSapo, puloQuartoSapo, puloQuintoSapo;


public ThreadCorrida(int puloPrimeiroSapo, int puloSegundoSapo, int puloTerceiroSapo, int puloQuartoSapo, int puloQuintoSapo) {
	
	this.puloPrimeiroSapo = puloPrimeiroSapo;
	this.puloSegundoSapo = puloSegundoSapo;
	this.puloTerceiroSapo = puloTerceiroSapo;
	this.puloQuartoSapo = puloQuartoSapo;
	this.puloQuintoSapo = puloQuintoSapo;

	
	
}


public void run () {
	
	primeiroSapo.start();
	segundoSapo.start();
	terceiroSapo.start();
	quartoSapo.start();
	quintoSapo.start();
	
}

 Thread primeiroSapo = new Thread() {

	 public void run() {
		
			int distancia = distanciamax; 
			
		 Random random = new Random ();
		 
		while(distancia > 0) { //Enquanto o sapo não percorrer toda a distância
			puloPrimeiroSapo = random.nextInt(10); //Salta, com um valor aleatório
			distancia = distancia - puloPrimeiroSapo; //O quanto ele falta para finalizar a corrida
			System.out.println("SAPO 1 PULOU " + puloPrimeiroSapo + " METROS. FALTA  " + distancia + " METROS"); //Apresentar o quanto saltou e quanto falta para chegar
		}
		
		colocacao++; //Quando finalizar a corrida, a variável global "colocacao" somará + 1, indicando a colocacao do sapo. 
		System.out.println("SAPO 1 FINALIZOU EM " +colocacao+ " º LUGAR");
	}
	
};


 Thread segundoSapo = new Thread() {
	public void run() {
		
		int distancia = distanciamax; 
		
		 Random random = new Random ();
		
		while(distancia > 0) {
			
			puloSegundoSapo = random.nextInt(10);
			distancia = distancia - puloSegundoSapo;
			System.out.println("SAPO 2 PULOU " + puloSegundoSapo + " METROS. FALTA  " + distancia + " METROS");
		}
		
		colocacao++;
		System.out.println("SAPO 2 FINALIZOU EM " +colocacao+ " º LUGAR");
	}
	
};

 Thread terceiroSapo = new Thread() {
	public void run() {
		
		int distancia = distanciamax; 
		 Random random = new Random ();
		
		while(distancia > 0) {
			
			puloTerceiroSapo = random.nextInt(10);
			distancia = distancia - puloTerceiroSapo;
			System.out.println("SAPO 3 PULOU " + puloTerceiroSapo + " METROS. FALTA  " + distancia + " METROS");
		}
	
		colocacao++;
		System.out.println("SAPO 3 FINALIZOU EM " +colocacao+ " º LUGAR");
		
	}
	
}; 

 Thread quartoSapo = new Thread() {
	public void run() {
		
		int distancia = distanciamax; 
		 Random random = new Random ();
		
		while(distancia > 0) {
			
			puloQuartoSapo = random.nextInt(10);
			distancia = distancia - puloTerceiroSapo;
			System.out.println("SAPO 4 PULOU " + puloQuartoSapo + " METROS. FALTA  " + distancia + " METROS");
		}
	
		colocacao++;
		System.out.println("SAPO 4 FINALIZOU " +colocacao+ " º LUGAR");
		
	}
	
}; 

 Thread quintoSapo = new Thread() {
	public void run() {
		
		int distancia = distanciamax; 
		 Random random = new Random ();
		
		while(distancia > 0) {
			
			puloQuintoSapo = random.nextInt(10);
			distancia = distancia - puloTerceiroSapo;
			System.out.println("SAPO 5 PULOU EM " + puloQuintoSapo + " METROS. FALTA  " + distancia + " METROS");
		}
	
		colocacao++;
		System.out.println("SAPO 5 FINALIZOU EM " +colocacao+ " º LUGAR");
		
	}
	
}; 




}




