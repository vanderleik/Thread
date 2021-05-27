package thread;

import java.util.Date;

public class SlowOperations {

	public static void main(String[] args) {
		
		Date momentoDoComeco = new Date();
		long comeco = momentoDoComeco.getTime();
		
		for (int i = 0; i < 3; i++) {
		for (long j = 0; j < 5000000000L; j++);
			
		Date momentEnded = new Date();
		long fim = momentEnded.getTime();
		long segundosGastos = (fim-comeco)/1000;
				
		System.out.println("Operação demorada demorou "+segundosGastos+" segundos");
			}
		}
	}