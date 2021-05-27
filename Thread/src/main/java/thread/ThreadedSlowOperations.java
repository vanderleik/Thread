package thread;

public class ThreadedSlowOperations {

	public static void main(String[] args) throws InterruptedException {

		ThreadSoComLoop  operacaoLenta1 = new ThreadSoComLoop(5000000000L);
		ThreadSoComLoop  operacaoLenta2 = new ThreadSoComLoop(5000000000L);
		ThreadSoComLoop  operacaoLenta3 = new ThreadSoComLoop(5000000000L);
		
		operacaoLenta1.start();
		operacaoLenta2.start();
		operacaoLenta3.start();
		
		operacaoLenta1.join();
		operacaoLenta2.join();
		operacaoLenta3.join();
		
		System.out.println("Operação demorada demorou "+operacaoLenta1.getSegundosGastos()+" segundos");
		System.out.println("Operação demorada demorou "+operacaoLenta2.getSegundosGastos()+" segundos");
		System.out.println("Operação demorada demorou "+operacaoLenta3.getSegundosGastos()+" segundos");
	}
}