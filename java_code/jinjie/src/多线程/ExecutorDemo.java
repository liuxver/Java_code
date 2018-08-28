package ∂‡œﬂ≥Ã;
import java.util.concurrent.*;

public class ExecutorDemo {
	public static void main(String[] args){
		//ExecutorService executor=Executors.newFixedThreadPool(1);
		ExecutorService executor=Executors.newCachedThreadPool();
		executor.execute(new PrintChar('A',100));
		executor.execute(new PrintChar('B',100));
		executor.execute(new PrintNum(100));
		
		executor.shutdown();
	}
}
