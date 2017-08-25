package com.LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Sorting {

	public Sorting(){
		
	}
	
	/*
	 * Sort using Collections.sort
	 * */
	public void sortByCollectionsUtil(){
		List<String> unsortedList = Util.unsortedStringList();
		System.out.println("The size of ArrayList is = "+unsortedList.size());
		Collections.sort(unsortedList);
		unsortedList.forEach(System.out::println);
		Collections.reverse(unsortedList);
		unsortedList.forEach(System.out::print);
	}
	/*
	 * Sort Arrays
	 * */
	public void sortArrays(){
		int[] unsortedArray = Util.unsortedIntArray();
		System.out.println("The size of integer Array is = "+unsortedArray.length);
		Arrays.sort(unsortedArray);
		for(int a:unsortedArray)
			System.out.println(a);
	}
	/*
	 * Sort HashMap by Key using TreeMap
	 * */
	public void sortHMbyKeyUsingTreeMap(){
		HashMap<Integer, String> hm = Util.simpleHashMap();
		hm.forEach((k,v) -> {
			System.out.println(k+v);
		});
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(hm);
		tm.forEach((k,v) -> {
			System.out.println("Key = "+k+"Value = "+v );
		});
	}
	/*
	 * Different ways to iterate through a HashMap
	 * 
	 * */
	public void iterateMap(){
		HashMap<Integer, String> hm = Util.simpleHashMap();
		
		/*Before Java 1.8 without using Generics
		 * */
		for(Map.Entry<Integer, String> obj: hm.entrySet()){
			System.out.println("Key = "+obj.getKey()+"Value = "+obj.getValue());
		}
		/*Before Java 1.8 using Generics
		 * */
		Iterator<Map.Entry<Integer, String>> s = hm.entrySet().iterator();
		while(s.hasNext())
			System.out.println(s.next().getKey()+s.next().getValue());
		/* 
		 * Using Java 1.8
		 */
		hm.forEach((k,v) ->{
			System.out.println(k+v);
		});
	}
	
	public void iterateList(){
		List<String> l = Util.unsortedStringList();
				
		while((l.listIterator()).hasNext()){
			System.out.println((l.listIterator()).next());
		}
	}
	
	
	public static void main(String[] args) {
		Sorting s = new Sorting();
		s.sortByCollectionsUtil();
		s.sortArrays();
		s.sortHMbyKeyUsingTreeMap();
		s.iterateList();
		List<ObjectComparable> l = Util.unsortedObjetComparator();
		l.sort((a,b) -> a.getTeaName().compareTo(b.getTeaName()));
		l.forEach(a -> {
			System.out.println(a.toString());
		});
		l.sort((a,b) -> a.getQuantity() - b.getQuantity());
		l.forEach(a -> {
			System.out.println(a.toString());
		});
		l.sort((a,b) -> a.getPrice() - b.getPrice());
		l.forEach(a -> {
			System.out.println(a.toString());
		});
	}
}
