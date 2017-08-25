package com.MultiThreading.ThreadGroup;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class DriverClass implements ThreadUtil{

	public static void main(String[] args) {
		new DriverClass().getMainThreadInfo();
	}
	
	private void getMainThreadInfo(){
		print("Main thread group "+Thread.currentThread().getThreadGroup().getName());
		print("Main thread parent "+Thread.currentThread().getThreadGroup().getParent());
		createThreadGroup();
		viewThreadGroup();
	}
	
	/* When we create a ThreadGroup in the below fashion, The parent group of the subgroup will be determined based on the thread that is executing it.
	 * EG: if main thread is executing, then NINJAGROUP will be a subgroup of MAINTHREADGROUP */
	private void createThreadGroup(){
		ThreadGroup ninjaGroup = new ThreadGroup("NINJAGROUP");
		print("This group name is : "+ninjaGroup.getName());
		print("Parent group of this group is : "+ninjaGroup.getParent().getName());
		/*to createChildGroup of NINJAGROUP*/
		ThreadGroup killersGroup = new ThreadGroup(ninjaGroup, "KILLERS");
		print("This group name is : "+killersGroup.getName());
		print("Parent group of this group is : "+killersGroup.getParent().getName());
		
		Thread t1 = new Thread(killersGroup, "T1");
		Thread t2 = new Thread(killersGroup, "T2");
		killersGroup.setMaxPriority(2); /* When setMaxPriority is set, 
		the existing thread's (t1,t2) priority in ThreadPool is not affected. New Threads added to the ThreadPool will be setMaxPriority as 2*/
		Thread t3 = new Thread(killersGroup, "T3");
		print(t1.getPriority());
		print(t2.getPriority());
		print(t3.getPriority());
		ninjaGroup.list();
		/*
		 * METHODS IN THREADGROUP
		 * ----------------------
		 * ThreadGroup getParent() - 
		 * void list() - Prints information about threadgroup to console
		 * int activeCount() - returns number of active threads present in the group
		 * int activeGroupCount() - returns number of active ThreadGroups present in the group
		 * int ennumerate(Thread[] t) - to copy all active threads of threadGroup into the provided ThreadArray. NOTE: subThread group threads will also be added.
		 * int ennumerate(ThreadGroup[] g) - to copy all active subthread groups into ThreadGroup array.
		 * boolean isDaemon - to check whether the ThreadGroup is daemon or not
		 * void setDaemon(boolean b) - set daemon nature to true
		 * void interrupt() - to interrupt all waiting or sleeping threads present in the ThreadGroup.
		 * void destroy() - destroys all the threads in the ThreadGroup 
		 * */
	}
	
	private void viewThreadGroup(){
		ThreadGroup TGroup = new ThreadGroup("TRILLIONARE GROUP");
		ThreadGroup bGroup = new ThreadGroup(TGroup, "BILLIONARE GROUP");
		WorkerThread t1 = new WorkerThread(bGroup, "Vinoth");
		WorkerThread t2 = new WorkerThread(bGroup, "Vicky");
		print("Active count in Tgroup = "+TGroup.activeCount());// This will be 0 now
		print("Active Group count in Tgroup = "+TGroup.activeGroupCount());// This will be 1 now
		t1.start();
		t2.start();
		print("Active count in Tgroup = "+TGroup.activeCount());// This will be 2 now
		print("Active Group count in Tgroup = "+TGroup.activeGroupCount());// This will be 1 now
		/* If this is bit confusing, draw a diagram to understand */
		showSystemGroup();
	}
	
	public void showSystemGroup(){
		/* Write a program to display all the active threads in System group and its child group */
		ThreadGroup sysGroup = Thread.currentThread().getThreadGroup().getParent();
		Thread[] t = new Thread[sysGroup.activeCount()];
		ThreadGroup[] tG = new ThreadGroup[100];
		sysGroup.enumerate(t);
		sysGroup.enumerate(tG);
		
		for(Thread T:t){
			print(T.getName());
		}
	}
}
