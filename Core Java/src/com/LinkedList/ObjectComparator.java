package com.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class ObjectComparator {
	
	public static void main(String[] args) {
		ObjectComparable obj1 = new ObjectComparable("A", 1, 5);
		ObjectComparable obj2 = new ObjectComparable("B", 2, 10);
		ObjectComparable obj3 = new ObjectComparable("C", 3, 15);
		
		List<ObjectComparable> unsortedList = new ArrayList<ObjectComparable>(3);
		unsortedList.add(obj1);
		unsortedList.add(obj2);
		unsortedList.add(obj3);
		unsortedList.sort((ObjectComparable obj,ObjectComparable objs) -> (obj.getTeaName()).compareTo(objs.getTeaName()));
//		Collections.sort(unsortedList, new Comparator<ObjectComparable>(){
//			@Override
//			public int compare(ObjectComparable arg0, ObjectComparable arg1) {
//				return arg0.getPrice() - arg1.getPrice();
//			}			
//		});
		unsortedList.forEach(arg ->{ 
			if(true) 				
				System.out.println(arg.getTeaName());
		});
	}
}
