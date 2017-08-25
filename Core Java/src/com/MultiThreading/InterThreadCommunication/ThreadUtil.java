package com.MultiThreading.InterThreadCommunication;

public interface ThreadUtil {
		
	public default String setCurrentThreadName(String s){
		Thread.currentThread().setName(s.toUpperCase());
		return Thread.currentThread().getName()+" THREAD";
	}
	
	public default void print(Object printThis){
		System.out.println(printThis.toString());
	}
	
	public default void print(String s,String s1,String s2){
		System.out.println(String.format("%s %s %s", s,s1,s2));
	}
}
