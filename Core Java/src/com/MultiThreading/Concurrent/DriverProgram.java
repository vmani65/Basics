package com.MultiThreading.Concurrent;

public class DriverProgram {

	public static void main(String[] args) {
		WorkerThread A = new WorkerThread();
		WorkerThread B = new WorkerThread();
		A.start();
		B.start();
	}
}
