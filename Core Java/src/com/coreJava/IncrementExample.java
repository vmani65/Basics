package com.coreJava;

public class IncrementExample {

	public static int ax; //Since we did not initialize ax, Java allocates 32bits to ax.
	public static float fa, fb, fc = 10.857f; // Only fc is initialized with value 10.857f. Rest are just declared without initialization.
	/*
	 * += vs =+ 
	 */
	public void unaryPlus(){
		int a= 0;
		int s = 1;
		
		a++; // Here perform the operation first and then increment the value of a; This should be interpreted as a = a+1;
		
		s += a; // This should be interpreted as s= s+a;
				
		System.out.println("Value of a = "+a);
		System.out.println("Value of s = "+s);

		s =+ 10; // This should be interpreted as s=(positive)10;
		a =- 5; // This should be interpreted as a=(negative)5;
		
		++a; // First increment a and then perform the operation
		
		System.out.println("Value of a = "+a);
		System.out.println("Value of s = "+s);
	}
	
	public void sysOutUnaryPlus(){
		int aX=0,bX = 0;
		System.out.println(aX++); // This will print 0. But the value of aX is now 1
		System.out.println(++bX); // This will print 1. Value of bX is now 1
	}
	
	public void testBODMASusingPreIncrement(){
		int a =5,b=7;
		int d = 2*3+b--; //Interpret this as "Finish calculation and decrease b"
		a+=d;
		int c= a;
//		This whole thing can be replaced as
//		int c = a += 2*3+b--
		System.out.println(c);
//		This will print 18 because it will decrement b only after performing the calculation.
	}

	public void testBODMASusingPostIncrement(){
		int a =5,b=7;
		int d = 2*3+(--b); //Interpret this as "Decrement b before performing the calculation"
		a+=d;
		int c= a;
//		This whole thing can be replaced as
//		int c = a += 2*3+(--b);
		System.out.println(c);
//		This will print 17 because it will decrement b and perform the calculation.
	}
	
	public double sqrtCalc(double v) throws ArithmeticException{
		if(v >= 0)
			return (double) Math.sqrt(v);
		else 
			throw new ArithmeticException();
	}
	
	public void wierdCalc(){
		Float f = new Float(3.1);
		Integer i = new Integer(1);
		long m = 2;
		System.out.println("Result = "+m+f+i);
	}
	
	public static void main(String[] args) {
		IncrementExample ex = new IncrementExample();
		ex.unaryPlus();
		ex.sysOutUnaryPlus();
		ex.testBODMASusingPreIncrement();
		ex.testBODMASusingPostIncrement();
		ex.wierdCalc();
		byte b = 0;
		short s = 1;
		double ds = 0;
		float f = 0f;
		try{
			ds = ex.sqrtCalc(4);
			if(b ==0 && s ==1){
				b++;
				s++;	
			}		
//			No catch block here because I don't care if an exception is thrown here.
//			Its the responsibility of the calling method to handle it.Bad programming actually.
		}finally{
			--ds; // Here double can also be incremented/decremented
			f++; // Float can be incremented/decremented
			b++; // byte can be incremented/decremented
			s++; // short can be incremented/decremented
			f = f+1; // int, long, float, double will allow arithmetic operation
//			b= b+1; // byte and short will not
//			s = s+1; // byte and short will not
		}
		System.out.println(ds);
	}
}
