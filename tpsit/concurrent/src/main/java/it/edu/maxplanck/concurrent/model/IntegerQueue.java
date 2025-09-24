package it.edu.maxplanck.concurrent.model;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class IntegerQueue {
	private ArrayList<Integer> list;
	Semaphore mutex;
	
	public IntegerQueue() {
		this.list=new ArrayList<Integer>();
		this.mutex=new Semaphore(1);
	}
	
	public void push(Integer i) throws InterruptedException {
		this.mutex.acquire();
		list.add(i);
		this.mutex.release();
	}
	
	public Integer pop() throws InterruptedException {
		this.mutex.acquire();
		Integer i = this.list.remove(0);
		this.mutex.release();
		return i;
	}
}
