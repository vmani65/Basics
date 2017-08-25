package com.MultiThreading.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class PrintJob implements Runnable, ThreadUtil{

	String name;
	
	PrintJob(String name){
		this.name = name;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			print(name +" work is done by "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		PrintJob[] jobs = {new PrintJob("Great"),new PrintJob("Will"),
						new PrintJob("Trading"),new PrintJob("Inc"),
						new PrintJob("Bet"),new PrintJob("Options")};
		ExecutorService e = Executors.newFixedThreadPool(3);
		for(PrintJob j:jobs){
			e.submit(j);
		}
		e.shutdown();
	}
}
