package com.greenstech.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {
	public static void main(String[] args) {
		// dissimilar data types are stored with one variable
		int a[] = { 100,200,300,400,500,100,700};
		List<Integer> l = new LinkedList<Integer>();
		

		for (int i = 0; i <7; i++) {
			l.add(a[i]);
		}
		System.out.println(l.size());
		System.out.println(l.indexOf(100));
		System.out.println(l.indexOf(300));
		System.out.println(l.lastIndexOf(100));
		System.out.println(l.equals(400));
		System.out.println(l.contains(400));
		System.out.println(l.remove(5));
		System.out.println(l.get(5));
		l.set(5, 100);
		System.out.println(l.get(5));
	}
}
