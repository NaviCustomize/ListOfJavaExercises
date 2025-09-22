package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	
	private List<T> list = new ArrayList<>();
	
	public void addValue(T value) {
		list.add(value);
	}
	
	
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List i ampty");
		}
		return list.get(0);
	}
	
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.println(", " + list.get(0));
		}
		System.out.println("]");
	}
	
}
