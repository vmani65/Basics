package com.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import com.Cloning.Cloning;
import com.Generics.GenericClass;
import com.LinkedList.ObjectComparable;

public class ListFwk {
	
	private List<Float> l;

	ListFwk(){
		
	}
	
	private void learnArrayList(){
		System.out.println("<learnArrayList>");
		/* Convert arrayList into LinkedList?
		 * Pass the arrayList as an argument to linkedList constructor.
		 */
		List<String> genericList = new ArrayList<String>();
		genericList.add(0,"A");
		genericList.add(1,"B");
		genericList.add(2,"C");
		
		/* What will happen when adding multiple objects at the same location?
		 * LinkedList and ArrayList will continue accepting and push the values below
         * It will keep the latest item added at the duplicate location and push everything down.
        */		
		List<String> linkedList = new LinkedList<String>(genericList);		
		linkedList.add(0,"D");
		linkedList.add(1,"E");
		linkedList.add(2,"F");
		linkedList.add(2,"G"); //Duplicates added @Location 2 will pushed down in the list.
		
		linkedList.forEach(obj -> {
			System.out.println(obj);
		});
		System.out.println("</learnArrayList>");
	}
	
	private void learnArrays(){
		
		System.out.println("<learnArrays>");
		String[] s = new String[5];
		s[0] = "";
		/* s[1] = 10;	This will throw compile time error. Declared array is of type String.*/ 		
		for(String obj:s)
			System.out.println(obj);
		System.out.println("</learnArrays>");

	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void learnGenericsClass(){

		System.out.println("<learnGenericsClass>");
		GenericClass<Object> generics = new GenericClass<Object>();
		generics.setCustomObject(1);
		int a = (Integer)generics.customObject;
		System.out.println(a);
		
		GenericClass<ObjectComparable> obj = new GenericClass<ObjectComparable>();
		obj.setCustomObject(new ObjectComparable("Lipton",10,1));
		String teaName = ((ObjectComparable)obj.customObject).getTeaName();
		System.out.println(teaName);
		
		/* While creating a generic class, its important to understand that the type can be declared during runtime
		 * In the above example we have created GenericClass of type Object and ObjectComparable.
		 * Based on the declaration, we can type-cast and access the objects.
		 * 
		 * In the below example, we will see how to use generic class as raw type
		 * The following annotation should be added on top of the method.
		 * Because we are creating an instance of the class without mentioning the type.
		 * So its a raw type which is unchecked. So we are adding the below annotaion.
		 * @SuppressWarnings({ "rawtypes", "unchecked" })
		 * 
		*/
		GenericClass rawType = new GenericClass();
		rawType.setCustomObject("customObject");
		rawType.setCustomObject(10);
		System.out.println(rawType.getCustomObject());
		System.out.println("</learnGenericsClass>");
	}
	/*
	 * Exception inside catch block will not be handled by the same catch block. 
	 * It will be thrown to the calling method.
	 */
	private void exceptionInsideCatch(){
		l = null;

		SortedSet<String> set = new TreeSet<String>();
		SortedMap<String,String> sm = new TreeMap<String,String>();
		
		System.out.println(set.add("b"));
		System.out.println(set.add("a"));
		System.out.println(set.add("d"));
		System.out.println(set.add("e"));
		System.out.println(set.add("c"));
		System.out.println(set.add("c"));
		
		set.forEach(a -> {
			System.out.println(a);
		});
		

		try{
			System.out.println(l.get(0));
		}catch(Exception e){
			System.out.println(l.get(0));			
			System.out.println("Exception inside catch block");			
		}		
	}
	
	public static void main(String[] args) {
		
		ListFwk fwk = new ListFwk();
		fwk.learnArrays();
		fwk.learnArrayList();
		fwk.learnGenericsClass();
		
		Cloning c = new Cloning();
		try{
			fwk.exceptionInsideCatch();
			Cloning copy =c.clone();
			System.out.println(copy.getConstant());
		}catch(CloneNotSupportedException ex){
			System.out.println(ex.toString());
		}catch(Exception e){
			System.out.println("Exception inside catch block was not handled");	
		}
	}
}
