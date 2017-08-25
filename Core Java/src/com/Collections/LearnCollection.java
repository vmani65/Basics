package com.Collections;

import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class LearnCollection {
	
	public LearnCollection(){
		
	}

	public void setInterfaceImpl(){
		Set<Float> floatSet = new HashSet<Float>();
		SortedSet<String> stringSet = new TreeSet<String>();
//		SortedSet<Object> objectSet = new
		Map<String,String> m = new HashMap<String,String>();
		
		SortedMap<String,String> sm = new TreeMap<String,String>();
		NavigableMap<String,String> nm = new TreeMap<String,String>();
		Map<String,String> srm = new TreeMap<String,String>();
		ConcurrentMap<String,String> chm = new ConcurrentHashMap<String,String>();
		
		SortedSet<String> st = new TreeSet<String>();
		NavigableSet<String> nS = new TreeSet<String>();
		Set<String> set = new TreeSet<String>();
		AbstractCollection<String> hashSet = new HashSet<String>();		
		HashSet<String> hSet = new HashSet<String>();				
		
		ArrayList aL = new ArrayList<>();
		List l = new ArrayList<>();
		LinkedList a = new LinkedList<>();
		
		Vector<String> v = new Vector<String>();
		Stack<String> s = new Stack<String>();
		
		hSet.iterator();
		
		List<String> vList = new Vector<String>();
		
	}
}
