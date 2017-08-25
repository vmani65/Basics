package com.AnonymousInnerClass;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class DriverClass implements ThreadUtil{
	
	public static void main(String[] args) {
		DriverClass d = new DriverClass();
		d.takeUSATour();
		d.delhiTrip();
		d.phoenixMallTrip();
		d.runWorker();
	}
	
	public void takeUSATour(){
		USATour t = new USATour(){
			@Override
			public String airlines(){
				return "EMIRATES AIRLINES";
			}
		};
		print(t);
		print(t.getClass().getName());
		
		USATour t1 = new USATour();
		print(t1);
		print(t1.getClass().getName());
		
		USATour t3 = new USATour(){
			@Override
			public String airlines() {
				return "QATAR AIRLINES";
			}
		};
		
		print(t3);
		print(t3.getClass().getName());
	}
	
	public void delhiTrip(){
		Domestic d = new Domestic() {
			
			@Override
			public String modeOfTransport() {
				return "FLIGHT";
			}

			@Override
			public String destination() {
				return "DELHI";
			}
		};
		print(d);
		print(d.getClass().getSimpleName());
	}
	
	public void phoenixMallTrip(){
		Tour t = new Tour(){
			@Override
			public String modeOfTransport() {
				return "CAR";
			}

			@Override
			public String domesticOrAbroad() {				
				return "LOCAL";
			}

			@Override
			public String[] members() {
				String[] m = {"JANANI","VINOTH"};
				return m;
			}

			@Override
			public float budgetCost() {				
				return 4509.65f;
			}			
		};
		print(t);
		print(getClass().getSimpleName());
	}
	
	public void runWorker(){
		Thread t = new Thread(){			
			@Override
			public void run(){
				print("This fellow does nothing");
			}
		};
		t.start();
		print("Main", "Thread finished"," execution");
		
	}
}
