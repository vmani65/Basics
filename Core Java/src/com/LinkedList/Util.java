package com.LinkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Util {
	public Util(){
		
	}
	/*
	 * HashMap makes absolutely no guarantees about the iteration order. 
	 * It can (and will) even change completely when new elements are added.
	 * The below HashMap will be sorted by default based on key. But this is absolutely not a guarantee.
	 */
	public static HashMap<Integer, String> simpleHashMap(){
		HashMap<Integer, String> hm = new HashMap<Integer, String>(10);
		hm.put(0, "d");
		hm.put(8, "f");
		hm.put(5, "i");
		hm.put(6, "a");
		hm.put(4, "e");
		hm.put(3, "h");
		hm.put(1, "g");
		hm.put(2, "c");
		hm.put(7, "b");
		return hm;
	}
	
	public static String[] unsortedStringArray(){
		String[] s = new String[10];
		s[0] = "a";
		s[9] = "b";
		s[5] = "c";
		s[8] = "d";
		s[2] = "e";
		s[3] = "f";
		s[6] = "g";
		s[7] = "h";
		s[1] = "i";
		s[4] = "j";		
		return s;
	}
	
	public static NavigableMap<Integer, String> getTreeMap(){
		NavigableMap<Integer, String> nMap= new TreeMap<Integer, String>(simpleHashMap());
		return nMap;
	}
	
	public static void getTreeSet(){
		
	}
	
	public static int[] unsortedIntArray(){
		int[] i = new int[10];
		i[0] = 1;
		i[9] = 2;
		i[5] = 3;
		i[8] = 4;
		i[2] = 5;
		i[3] = 6;
		i[6] = 7;
		i[7] = 8;
		i[1] = 9;
		i[4] = 10;		
		return i;
	}
	
	public static List<String> unsortedStringList(){
		List<String> s = new ArrayList<>();
		s.add("a");
		s.add("b");
		s.add("d");
		s.add("c");
		s.add("f");
		s.add("e");
		return s;
	}
	
	public static List<ObjectComparable> unsortedObjetComparator(){
		List<ObjectComparable> unsortedList = new ArrayList<ObjectComparable>(3);
		unsortedList.add(new ObjectComparable("B", 1, 5));
		unsortedList.add(new ObjectComparable("A", 2, 10));
		unsortedList.add(new ObjectComparable("D", 3, 15));
		unsortedList.add(new ObjectComparable("C", 4, 15));
		return unsortedList;
	}
	
}
