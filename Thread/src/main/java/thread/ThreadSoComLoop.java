package thread;

import java.util.Date;

public class ThreadSoComLoop extends Thread{
	
	private long segundosGastos;
	private long numeroDeIteracoes;
	
	public ThreadSoComLoop(long numeroDeIteracoes) {
		this.numeroDeIteracoes = numeroDeIteracoes;
	}
	
	@Override
	public void run() {
		
		Date momentoDoComeco = new Date();
		long comeco = momentoDoComeco.getTime();
		
		for (long i = 0; i < numeroDeIteracoes; i++);
			
			Date momentEnded = new Date();
			long fim = momentEnded.getTime();
			
			segundosGastos = (comeco-fim)/1000;
			
		}
		public long getSegundosGastos() {
			return segundosGastos;				
		}
	}