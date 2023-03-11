package controller02;

public class ThreadSomaLinha extends Thread {

	private int matriz[][];
	
	public ThreadSomaLinha(int[][] matriz) {
		this.matriz = matriz;
	
	}
	
	public void run() {
		
		//Após preencher a matriz, chama as threads. 
		//Cada uma é responsável por somar uma linha
		
	
		
		primeiraLinha.start();
		segundaLinha.start();
		terceiraLinha.start();
		
	}
	
	 Thread primeiraLinha = new Thread() {
		public void run() {
			int soma = 0, i=0, j=0; 			//1ª linha
			
			while(j < 4) {						//Loop baseado nas colunas
				soma = soma + matriz[i][j]; 		//Soma os valores
				j++;
			} 
			
			System.out.println("1º LINHA = " +soma);
			
		} 
	};
	
	 Thread segundaLinha = new Thread() {
		public void run() {
			int soma = 0, i=1, j=0;				//2ª linha
			
			while(j < 4) {
				soma = soma + matriz[i][j];
				j++;
			} 
			
			System.out.println("2º LINHA = " +soma);
			
		} 
	};

	 Thread terceiraLinha = new Thread() {
		public void run() {
			int soma = 0, i=2, j=0;			//3ª linha 
			
			while(j < 4) {
				soma = soma + matriz[i][j];
				j++;
			} 
			
			System.out.println("3º LINHA = " +soma);
			
		} 
	};

	

}

	
	
	
	

