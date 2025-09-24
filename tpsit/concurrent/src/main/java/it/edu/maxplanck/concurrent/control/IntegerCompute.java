package it.edu.maxplanck.concurrent.control;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

import it.edu.maxplanck.concurrent.model.IntegerQueue;

public class IntegerCompute implements Runnable{
	private IntegerQueue queue;
	private Semaphore sem; //"semaphore"
	
	public IntegerCompute(IntegerQueue queue, Semaphore sem) {
		this.queue=queue;
		this.sem=sem;
	}
	
	public void run() {
		while (true) {
			try {
				sem.acquire();
				Integer i = queue.pop(); //signal  extract from the stack (sem--)
				System.out.println(Thread.currentThread().getName() + ": Preleva numero  " + i.intValue());
				
				//int elaboration
				Thread.sleep(ThreadLocalRandom.current().nextInt(200, 1000));	//random waiting time between 200ms and 1000ms
				
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
