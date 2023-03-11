package controller00;

public class ThreadVetor extends Thread {
	
	private int vetor[], valor;
	
	public ThreadVetor(int []vetor, int valor) {
		
		this.vetor = vetor;
		this.valor = valor;
	
	}
	
	
	public void run() {
	
		
		//CASO SEJA PAR
	if(valor % 2 == 0) {
		System.out.println("Iniciando Método FOR");
		
		double tempoInicial = System.nanoTime();
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("TEMPO DO MÉTODO FOR: " +tempoTotal+ " segundos");	
	}
	
	//CASO SEJA ÍMPAR
	
	if(valor % 2 != 0) {
		System.out.println("Iniciando Método FOR EACH");

		double tempoInicial = System.nanoTime();
		for(int j : vetor) {
			System.out.println(j);
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10, 9);
		System.out.println("TEMPO DO MÉTODO FOR EACH: " +tempoTotal+ " segundos");
	}

}
	
	

}




