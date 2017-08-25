package com.LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ObjectComparable implements Comparable<ObjectComparable>, Cloneable{	

	private String teaName;
	private int price;
	private int quantity;
	
	public ObjectComparable(){
		
	}
	
	public ObjectComparable(String teaName, int price, int quantity){
		this.teaName = teaName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String getTeaName() {
		return teaName;
	}
	public void setTeaName(String teaName) {
		this.teaName = teaName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
		
	@Override
	public int compareTo(ObjectComparable arg0) {
		return arg0.getPrice()- this.price ;
	}
	
	public static void main(String[] args) {
		ObjectComparable obj1 = new ObjectComparable("A", 1, 5);
		ObjectComparable obj2 = new ObjectComparable("B", 2, 10);
		ObjectComparable obj3 = new ObjectComparable("C", 3, 15);
		
		List<ObjectComparable> unsortedList = new ArrayList<ObjectComparable>(3);
		unsortedList.add(obj1);
		unsortedList.add(obj2);
		unsortedList.add(obj3);
		
		Collections.sort(unsortedList);
		for(ObjectComparable obj:unsortedList){
			System.out.println(obj.getPrice());
		}
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + quantity;
		result = prime * result + ((teaName == null) ? 0 : teaName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectComparable other = (ObjectComparable) obj;
		if (price != other.price)
			return false;
		if (quantity != other.quantity)
			return false;
		if (teaName == null) {
			if (other.teaName != null)
				return false;
		} else if (!teaName.equals(other.teaName))
			return false;
		return true;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "ObjectComparable [teaName=" + teaName + ", price=" + price + ", quantity=" + quantity + "]";
	}
}
