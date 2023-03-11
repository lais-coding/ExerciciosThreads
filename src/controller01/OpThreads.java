package controller01;

public class OpThreads extends Thread {
	
	private int n1, n2;
	
	public OpThreads(int n1, int n2) {
		
		this.n1= n1;
		this.n2 = n2;
		
				
	}
	
	public void run() {
		
		Somar.start();
		Subtrair.start();
		Multiplicar.start();
		Dividir.start();
		Exponenciacao.start();
	}
	

	 Thread Somar = new Thread() {
		public void run() {
			int resultado = n1 + n2;
			System.out.println(n1 + " " +  " + " + n2 + " = " +resultado);
		}
		
	};
	
	 Thread Subtrair = new Thread() {
		public void run() {
			int resultado = n1 - n2;
			System.out.println(n1 + " " +  " - " + n2 + " = " +resultado);
		}
		
	};
	
	 Thread Multiplicar = new Thread() {
		public void run() {
			int resultado = n1 * n2;
			System.out.println(n1 + " " +  " * " + n2 + " = " +resultado);
		}
		
	};
	
	 Thread Dividir = new Thread() {
		public void run() {
			int resultado = (n1 / n2);
			System.out.println(n1 + " " +  " / " + n2 + " = " +resultado);
		}
		
	};
	
	 Thread Exponenciacao = new Thread() {
		public void run() {
			int resultado = (int) Math.pow (n1, n2);
			System.out.println(n1 + " " +  " ^ " + n2 + " = " +resultado);
		}
		
	};



}


