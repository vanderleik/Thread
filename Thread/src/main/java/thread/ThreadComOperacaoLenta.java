package thread;

import java.util.Date;

public class ThreadComOperacaoLenta extends Thread{

	@Override
	public void run() {
		
		Date dataComeco = new Date();
		long comeco = dataComeco.getTime();
		
		for (long j = 0; j < 5000000000L; j++); 
		
		Date momentEnded = new Date();
		long fim = momentEnded.getTime();
		
		long segundosGastos = (fim-comeco)/1000;
		
		System.out.println("Operação demorada demorou "+segundosGastos+" segundos");
			
			
		
			

	}

}
