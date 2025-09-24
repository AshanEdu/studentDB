package it.edu.maxplanck.concurrent;

import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadLocalRandom;

import it.edu.maxplanck.concurrent.control.IntegerCompute;
import it.edu.maxplanck.concurrent.model.IntegerQueue;

public class App {
    public static void main( String[] args ){
		IntegerQueue queue = new IntegerQueue();
		Semaphore sem = new Semaphore(0);
		
		IntegerCompute compute = new IntegerCompute(queue, sem);
		
		Thread t1 = new Thread(compute);
		Thread t2 = new Thread(compute);
		Thread t3 = new Thread(compute);
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread2");
		
		t1.start();
		t2.start();
		t3.start();
		
		while (true) {
			int i = ThreadLocalRandom.current().nextInt();
			try {
				queue.push(Integer.valueOf(i));
				System.out.println(Thread.currentThread().getName() + "   : Aggiunto numero "+i);
				
				sem.release(); //signal add to stack (sem++)
				
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
    }
}
