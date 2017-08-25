package com.MultiThreading.ThreadPool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class Futures implements Callable<Object>,ThreadUtil {

	int values;
	
	public Futures(){
		
	}
	public Futures(int values){
		this.values = values;
	}
	
	@Override
	public Object call() throws Exception {
		int sum =0;
		for(int i=0; i<=values; i++)
			sum+= values;
		return sum;
	}
	public static void main(String[] args) {
		try{
			new Futures().executeFutures();			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	private void executeFutures() throws Exception{
		Futures[] futures = {new Futures(5),new Futures(10),new Futures(15),new Futures(20),new Futures(25)};
		ExecutorService ex = Executors.newFixedThreadPool(3);
		for(Futures f: futures){
			Future<?> val = ex.submit(f);
			print(val.get());
		}	
		ex.shutdown();
	}
}
