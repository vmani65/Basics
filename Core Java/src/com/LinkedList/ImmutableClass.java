package com.LinkedList;

import java.util.HashSet;
import java.util.Set;
/*
 * How to create a immutable class?
 * 1. Declare the class final
 * 2. Declare all member variables as final
 * 3. Initialize all member variables through constructor
 * 4. Through Constructor, return a deep copy of the object
 * 5. No setters. Only getters. In getters return a copy of the object rather than reference
 */
public final class ImmutableClass {
	
	private final String hardDrive;	
	private final String monitor;
	private final float processor;
	private final long serviceTagNumber; 
	private final Set<ObjectComparable> objectSet;
	
	/*
	 * This is a shallow copy constructor
	 */
//	public ImmutableClass(String hardDrive, String monitor, float processor, long serviceTagNumber, Set<ObjectComparable> objectSet){
//		System.out.println("Performing a shallow copy");
//		this.hardDrive = hardDrive;
//		this.monitor = monitor;
//		this.processor = processor;
//		this.serviceTagNumber = serviceTagNumber;
//		this.objectSet = objectSet;
//	}
	
	/*
	 * This is a deep copy constructor
	 * What is the difference here?
	 * While initializing the object, we are returning a deep copy.
	 * Any changes to the reference will not affect the original object
	 */ 
	
	public ImmutableClass(String hardDrive, String monitor, float processor, long serviceTagNumber, Set<ObjectComparable> objectSet){
		System.out.println("Performing a deep copy");
		this.hardDrive = hardDrive;
		this.monitor = monitor;
		this.processor = processor;
		this.serviceTagNumber = serviceTagNumber;
				
		Set<ObjectComparable> tempSet = new HashSet<ObjectComparable>();		
		objectSet.forEach(obj ->{
			ObjectComparable comp = new ObjectComparable();
			comp.setPrice(obj.getPrice());
			comp.setTeaName(obj.getTeaName());
			comp.setQuantity(obj.getQuantity());
			tempSet.add(comp);
		});
		
		this.objectSet = tempSet;
	}
	 

	public String getHardDrive() {
		return hardDrive;
	}

	public String getMonitor() {
		return monitor;
	}

	public float getProcessor() {
		return processor;
	}

	public long getServiceTagNumber() {
		return serviceTagNumber;
	}

	public Set<ObjectComparable> getObjectSet() {
		/*
		 * We cannot clone a collection. 
		 * This collection contains ObjectComparable object.
		 * So ObjectComparable class should implement Cloneable interface.
		 * Its up to us to implement .clone() method in our class.
		 * If not implemented, it'll use super.clone() method to clone the object
		 */
		Set<ObjectComparable> tempObj = new HashSet<ObjectComparable>(objectSet.size());
		objectSet.forEach(obj -> {
			try{
				tempObj.add((ObjectComparable)obj.clone());				
			}catch(CloneNotSupportedException ex){
				System.out.println(ex);
			}
		});
		return tempObj;
	}

	public static void main(String[] args) {
		String hardDrive = "Western Digital";
		String monitor = "Lenovo";
		float processor = 7.99F;
		long serviceTagNumber = 105_369_5571;
		ObjectComparable obj1 = new ObjectComparable("Tata",5,1);
		ObjectComparable obj2 = new ObjectComparable("BrookeBond", 2, 5);
		Set<ObjectComparable> tempSet = new HashSet<ObjectComparable>();
		tempSet.add(obj1);
		tempSet.add(obj2);
		ImmutableClass clz = new ImmutableClass(hardDrive, monitor, processor, serviceTagNumber, tempSet);
		System.out.println(clz.toString());
		/* Now change all the references through which Immutable class was initialized.
		 **/
		hardDrive = "Fantom";
		monitor = "Dell";
		processor = 14.00F;
		serviceTagNumber = 199_300_5571;
		tempSet.add(new ObjectComparable("Lipton",1,1));
		System.out.println(clz.getObjectSet());
		System.out.println(clz.toString());	
		/* Oops. While printing the same old class, we see an additional item in the Set<> which has changed.
		 * Why?
		 * The string references will behave differently from object references. See StringReferences.java class
		 * The reference to tempSet had changed. This affects the object
		 * Now uncomment the deep-copy constructor, comment shallow copy constructor and run.
		 **/
	}

	@Override
	public String toString() {
		return "ImmutableClass [hardDrive=" + hardDrive + ", monitor=" + monitor + ", processor=" + processor
				+ ", serviceTagNumber=" + serviceTagNumber + ", objectSet=" + objectSet.toString() + "]";
	}
}
