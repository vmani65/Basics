package com.LinkedList;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeToString {
	EqualsHashCodeToString(){
		
	}
	public static void main(String[] args) {
		ObjectComparable obj1 = new ObjectComparable("A", 1, 5);
		ObjectComparable obj2 = new ObjectComparable("A", 1, 5);
		ObjectComparable obj3 = new ObjectComparable("A", 1, 5);

		
		Set<ObjectComparable> set = new HashSet<ObjectComparable>();
		
//		Set will not throw compile error while adding duplicates.
//      But during the runtime when the actual duplicate addition should happen, it will not happen		
		Set<String> stringSet = new HashSet<String>();
		stringSet.add("A");
		stringSet.add("A"); // Printing this statement will print 'false'
		System.out.print(stringSet.add("A"));
		stringSet.forEach(a -> {
			System.out.println(a);
		});
		
		set.add(obj1);
		set.add(obj2);
//		Hashing retrieval is a two-step process.
//		Find the right bucket (using hashCode())
//		Search the bucket for the right element (using equals() )

		System.out.print(set.contains(obj3));		
		set.forEach(arg0 -> {
			System.out.print(arg0.getPrice());
			System.out.print(arg0.getQuantity());
			System.out.print(arg0.getTeaName());
		});		
	}
}
