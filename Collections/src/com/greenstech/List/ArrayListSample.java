package com.greenstech.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListSample {

	public static void main(String[] args) {
		// dissimilar data types are stored with one variable
		int a[] = { 10, 20, 30, 90, 10, 10, 40, 50 };
		List<Integer> l = new ArrayList();

		for (int i = 0; i < a.length ; i++) {
			l.add(a[i]);
		}
		System.out.println(l.size());
		System.out.println(l.indexOf(10));
		System.out.println(l.indexOf(90));
		System.out.println(l.lastIndexOf(10));
		System.out.println(l.equals(40));
		System.out.println(l.contains(40));
		System.out.println(l.remove(5));
		System.out.println(l.get(5));
		l.set(5, 10);
		System.out.println(l.get(5));
		
//		List l1 = new LinkedList();
//		for (int i = 0; i < 8; i++) {
//			l.add(a[i]);
//		}

	}
}
