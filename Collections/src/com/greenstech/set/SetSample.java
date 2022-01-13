package com.greenstech.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetSample {

	public static void main(String[] args) {
		//Hashset--- Random Order
		Set set = new HashSet();
		set.add(15);
		set.add('a');
		set.add(14);
		set.add(149);
		set.add(18);
		set.add(12);
		set.add(15);
		System.out.println(set);
		//LinkedHashSet --- Insertion Order
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(153);
		set1.add(19);
		set1.add(16);
		set1.add(14);
		set1.add(18);
		set1.add(12);
		set1.add(15);
		System.out.println(set1);
		//TreeSet --- Ascending Order
		Set<Integer> set2 = new TreeSet<>();
		set2.add(13);
		set2.add(19);
		set2.add(16);
		set2.add(14);
		set2.add(18);
		set2.add(12);
		set2.add(15);
		System.out.println(set2);
		
	}

}
